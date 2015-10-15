package com.mycompany.storage;

import com.mycompany.admin.NewsDisplay;
import com.mycompany.admin.NewsToDisplay;
import com.mycompany.structure.NewsList;
import com.mycompany.structure.data.News;

public class Storege {

    public void addToStoreg(News list) {
        //TODO: Необходимо определится где мы будем хранить данные
    }

    public NewsList getNews(NewsToDisplay watDisplay) {
        //TODO: Необходимо определится где мы будем хранить данные
        //TODO: Необходимо определится на каком этапе будет формироватся список новостей
        NewsList list = new NewsList();
        list.addNews(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.addNews(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.addNews(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.addNews(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.addNews(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        return list;
    }
}
