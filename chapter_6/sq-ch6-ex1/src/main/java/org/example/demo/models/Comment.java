package org.example.demo.models;

public class Comment {
    private String text;
    private String author;

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return this.text;
    }

    public String getAuthor() {
        return this.author;
    }
}
