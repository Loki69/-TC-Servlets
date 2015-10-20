package com.mycompany.storage;

import com.mycompany.admin.orpions.OptionsSelection;
import com.mycompany.structure.data.News;
import java.util.ArrayList;
import java.util.List;

public class Storege {

    public void addToStorege(News list) {
    }

    public List<News> getNews(OptionsSelection watDisplay) {
        //TODO: Необходимо определится где мы будем хранить данные
        //TODO: Необходимо определится на каком этапе будет формироватся список новостей
        List<News> list = new ArrayList();
        list.add(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG", "ru"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("бубука", "Туртурка", "ПОБОЛТУШКИ И ВСЯКОЕ ТАКОЕ",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        return list;
    }
}
