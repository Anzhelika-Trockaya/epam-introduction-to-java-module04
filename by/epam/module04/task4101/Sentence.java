package by.epam.module04.task4101;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence implements Serializable {
    private List<Word> words;
    private String punctuationMark;
    private boolean isEndParagraph;

    public Sentence() {
        words = new ArrayList<>();
        punctuationMark = "";
        isEndParagraph = false;
    }

    public Sentence(List<Word> words, String punctuationMark) {
        if (words != null && !words.isEmpty()) {
            this.words = words;
        } else {
            this.words = new ArrayList<>();
        }

        if (punctuationMark != null && (punctuationMark.isEmpty() || punctuationMark.matches("\\.{1,3}|!|\\?"))) {
            this.punctuationMark = punctuationMark;
        } else {
            throw new IllegalArgumentException("Incorrect punctuation mark!");
        }

        isEndParagraph = false;
    }

    public Sentence(List<Word> words, String punctuationMark, boolean isEndParagraph) {
        if (words != null && !words.isEmpty()) {
            this.words = words;
        } else {
            this.words = new ArrayList<>();
        }

        if (punctuationMark != null && (punctuationMark.isEmpty() || punctuationMark.matches("\\.{1,3}|!|\\?"))) {
            this.punctuationMark = punctuationMark;
        } else {
            throw new IllegalArgumentException("Incorrect punctuation mark!");
        }

        this.isEndParagraph = isEndParagraph;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        if (words != null) {
            this.words = words;
        } else {
            this.words.clear();
        }
    }

    public String getPunctuationMark() {
        return punctuationMark;
    }

    public void setPunctuationMark(String punctuationMark) {
        if (punctuationMark == null) {
            this.punctuationMark = "";
        } else if (punctuationMark.matches("\\.{1,3}|!|\\?") || punctuationMark.isEmpty()) {
            this.punctuationMark = punctuationMark;
        } else {
            throw new IllegalArgumentException("Incorrect punctuation mark!");
        }
    }

    public boolean isEndParagraph() {
        return isEndParagraph;
    }

    public void setEndParagraph(boolean endParagraph) {
        isEndParagraph = endParagraph;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "words=" + words +
                ", punctuationMark='" + punctuationMark + '\'' +
                ", isEndParagraph=" + isEndParagraph +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return isEndParagraph == sentence.isEndParagraph &&
                words.equals(sentence.words) &&
                punctuationMark.equals(sentence.punctuationMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, punctuationMark, isEndParagraph);
    }
}
