package bean;

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String quote;
    private Author author;

    public Quote() {
    }

    public Quote(long id, String name, Author author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setName(String name) {
        this.quote = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
