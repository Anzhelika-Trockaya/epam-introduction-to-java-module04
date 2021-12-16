package by.epam.module04.task4101;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {
    private Sentence title;
    private List<Sentence> sentences;

    public Text() {
        title=new Sentence();
        sentences = new ArrayList<>();
    }

    public Text(List<Sentence> sentences) {
        title=new Sentence();

        if (sentences != null) {
            this.sentences = sentences;
        } else {
            this.sentences = new ArrayList<>();
        }
    }

    public Text(Sentence title, List<Sentence> sentences) {
        if (title != null) {
            this.title = title;
        } else{
            this.title=new Sentence();
        }

        if (sentences != null) {
            this.sentences = sentences;
        } else {
            this.sentences = new ArrayList<>();
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        if (sentences != null) {
            this.sentences = sentences;
        } else {
            this.sentences.clear();
        }
    }

    public void setTitle(Sentence title) {
        if (title != null) {
            this.title = title;
        } else{
            this.title=new Sentence();
        }
    }

    public Sentence getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "title=" + title +
                ", sentences=" + sentences +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return title.equals(text.title) &&
                sentences.equals(text.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, sentences);
    }
}
