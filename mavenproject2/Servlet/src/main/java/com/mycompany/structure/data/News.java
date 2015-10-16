package com.mycompany.structure.data;

public class News {

    public final String CATEGORY;
    public final String TITLE;
    public final String DESCRIPTION;
    public final String IMAGES[];
    public final String PUBLISHED_DATE;
    public final String AUTHOR;
    public final String SOURCE;

    public News() {
        CATEGORY = "";
        TITLE = "";
        DESCRIPTION = "";
        IMAGES = new String[0];
        PUBLISHED_DATE = "";
        AUTHOR = "";
        SOURCE = "";
    }

    public News(String CATEGORY, String TITLE, String DESCRIPTION, String[] IMAGES, String PUBLISHED_DATE, String AUTHOR, String SOURCE) {
        this.CATEGORY = CATEGORY;
        this.TITLE = TITLE;
        this.DESCRIPTION = DESCRIPTION;
        this.IMAGES = IMAGES;
        this.PUBLISHED_DATE = PUBLISHED_DATE;
        this.AUTHOR = AUTHOR;
        this.SOURCE = SOURCE;
    }

}
