package com.mycompany.structure;

import com.mycompany.servlet.News;
import java.util.List;
import java.util.ArrayList;

public class NewsList {

    private List<News> list;

    public NewsList() {
        this.list = new ArrayList<News>();
    }

    public List<News> getList() {
        return list;
    }

    public void addNews(News news) {
        this.list.add(news);
    }

}
