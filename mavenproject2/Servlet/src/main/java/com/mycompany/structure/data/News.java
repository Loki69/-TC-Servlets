package com.mycompany.structure.data;

public class News {

    public final String category;
    public final String language;
    public final String title;
    public final String description;
    public final String[] images;
    public final String publishedDate;
    public final String author;
    public final String source;

    public News(String category, String title, String description, String[] images, String publishedDate, String author, String source, String language) {
        this.category = category;
        this.title = title;
        this.description = description;
        this.images = images;
        this.publishedDate = publishedDate;
        this.author = author;
        this.source = source;
        this.language = language;
    }
}
