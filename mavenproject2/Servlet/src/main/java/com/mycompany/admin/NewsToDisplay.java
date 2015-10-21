package com.mycompany.admin;

import com.mycompany.admin.orpions.OptionsSelection;
import com.mycompany.format.FormatPrinter;
import com.mycompany.format.JsonPrinter;
import com.mycompany.storage.StoregeNews;
import com.mycompany.structure.data.News;
import java.util.List;

public class NewsToDisplay {

    private List<News> listNews;

    public NewsToDisplay() {
    }

    public String printJson() {
        List<News> newsList = getNewsToDisplay();
        FormatPrinter print = new JsonPrinter(newsList);
        return print.print();
    }

    private List<News> getNewsToDisplay() {
        StoregeNews storege = new StoregeNews();
        return storege.getNews(new OptionsSelection());
    }
}
