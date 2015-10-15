package com.mycompany.structure.data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class News {

    public final String CATEGORY;
    public final String TITLE;
    public final String DESCRIPTION;
    public final List<String> IMAGES;
    public final Date PUBLISHED_DATE;
    public final String AUTHOR;
    public final String SOURCE;

    public News() {
        CATEGORY="";
        TITLE="";
        DESCRIPTION="";
        IMAGES=new ArrayList<String>();
        PUBLISHED_DATE = new Date(1);
        AUTHOR = "";
        SOURCE="";
    }

}
