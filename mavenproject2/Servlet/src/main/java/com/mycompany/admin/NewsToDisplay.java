package com.mycompany.admin;

import java.util.ArrayList;
import java.util.List;

public class NewsToDisplay {

    private List<NewsDisplay> listNews;

    public NewsToDisplay() {
        //TODO: ������ ���� �� ������ ��������� �������
        //TODO:����� ���������� � ���������� ��������� �������
        //���� �� ��������� ����� ��������
        this.listNews = new ArrayList();
        listNews.add(new NewsDisplay(1, 10));
        listNews.add(new NewsDisplay(2, 10));
        listNews.add(new NewsDisplay(3, 10));
        listNews.add(new NewsDisplay(4, 10));
        listNews.add(new NewsDisplay(5, 10));
        listNews.add(new NewsDisplay(6, 10));
    }

    public List<NewsDisplay> newsToDisplay() {
        return listNews;
    }

    public List<NewsDisplay> getConfig() {
        return listNews;
    }

}
