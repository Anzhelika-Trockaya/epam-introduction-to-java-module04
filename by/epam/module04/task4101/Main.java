package by.epam.module04.task4101;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String textString;
        Text text;
        TextLogic textLogic;
        InputTextData inputTextData;
        List<Word> newSentenceWords;

        inputTextData = new InputTextData();
        textLogic=new TextLogic();

        textString = inputTextData.enterText();
        text = textLogic.parseText(textString);
        System.out.printf("%20s",textLogic.getFormattedText(text));
        System.out.println("\n");

        newSentenceWords = new ArrayList<>();
        newSentenceWords.add(new Word("Он"));
        newSentenceWords.add(new Word("разорвал"));
        newSentenceWords.add(new Word("змею"));
        newSentenceWords.add(new Word("и"));
        newSentenceWords.add(new Word("стал"));
        newSentenceWords.add(new Word("ужинать"));
        String newSentencePunctuationMark = ".";

        textLogic.add(text, new Sentence(newSentenceWords, newSentencePunctuationMark));
        System.out.println(textLogic.getFormattedText(text)+"\n");

        System.out.print("Title: ");
        System.out.println(textLogic.getFormattedSentence(text.getTitle()));

    }
}
