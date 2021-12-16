package by.epam.module04.task4101;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextLogic {
    public String textToString(Text text) {
        StringBuilder textBuilder = new StringBuilder();

        textBuilder.append(sentenceToString(text.getTitle()));
        textBuilder.append('\n');

        for (Sentence sentence : text.getSentences()) {
            textBuilder.append(sentenceToString(sentence));
            if (sentence.isEndParagraph()) {
                textBuilder.append('\n');
            } else {
                textBuilder.append(' ');
            }
        }

        return textBuilder.toString();
    }

    public String sentenceToString(Sentence sentence) {
        StringBuilder sentenceBuilder;
        List<Word> sentenceWords;
        int penultimateWordIndex;

        sentenceBuilder = new StringBuilder();
        sentenceWords = sentence.getWords();
        penultimateWordIndex = sentenceWords.size() - 1;

        if (!sentenceWords.isEmpty()) {
            for (int i = 0; i < penultimateWordIndex; i++) {
                sentenceBuilder.append(sentenceWords.get(i).getString());
                sentenceBuilder.append(' ');
            }

            sentenceBuilder.append(sentenceWords.get(penultimateWordIndex).getString());
            sentenceBuilder.append(sentence.getPunctuationMark());
        }

        return sentenceBuilder.toString();
    }

    public String getFormattedText(Text text) {
        String textString;
        StringBuilder textBuilder;
        Pattern pattern;
        Matcher matcher;
        int start;

        textString = textToString(text);
        textBuilder = new StringBuilder();
        pattern = Pattern.compile(".{1,120}(\\p{P}|\\s|\\n)");
        matcher = pattern.matcher(textString);
        start = 0;

        while (matcher.find(start)) {
            textBuilder.append(matcher.group());
            textBuilder.append('\n');
            start = matcher.end();
        }

        return textBuilder.toString();
    }

    public String getFormattedSentence(Sentence sentence) {
        String textString;
        StringBuilder textBuilder;
        Pattern pattern;
        Matcher matcher;
        int start;

        textString = sentenceToString(sentence);
        textBuilder = new StringBuilder();
        pattern = Pattern.compile(".{1,120}(\\p{P}|\\s|\\n)?");
        matcher = pattern.matcher(textString);
        start = 0;

        while (matcher.find(start)) {
            textBuilder.append(matcher.group());
            textBuilder.append('\n');
            start = matcher.end();
        }

        return textBuilder.toString();
    }

    public void add(Text text, Sentence sentence) {
        text.getSentences().add(sentence);
    }

    public Text parseText(String textString) {
        Text text;
        Sentence title;
        List<Sentence> sentences;
        List<Word> sentenceWords;
        String punctuationMark;

        Pattern wordPattern;
        Matcher wordMatcher;

        sentences = new ArrayList<>();
        sentenceWords = new ArrayList<>();

        wordPattern = Pattern.compile("([A-Za-zА-яа-яЁё0-9-_]+)(:|;|,|( —))?(\s|(\n)|(!|\\?|\\.{1,3}))(\n?)");
        wordMatcher = wordPattern.matcher(textString);

        while (wordMatcher.find()) {
            sentenceWords.add(new Word(wordMatcher.group(1)));

            if (wordMatcher.group(6) != null) {
                punctuationMark = wordMatcher.group(6);

                sentences.add(new Sentence(
                        new ArrayList<>(sentenceWords), punctuationMark, !wordMatcher.group(7).isEmpty()
                ));

                sentenceWords.clear();
            } else if (wordMatcher.group(5) != null) {
                punctuationMark = "";

                sentences.add(new Sentence(
                        new ArrayList<>(sentenceWords), punctuationMark, true
                ));

                sentenceWords.clear();
            }
        }

        title = sentences.get(0);
        sentences.remove(0);

        text = new Text(title, sentences);

        return text;
    }
}
