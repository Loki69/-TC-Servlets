package com.mycompany.storage;

import com.mycompany.admin.NewsToDisplay;
import com.mycompany.structure.data.News;
import java.util.ArrayList;
import java.util.List;

public class Storege {

    public void addToStorege(News list) {
        //TODO: ���������� ����������� ��� �� ����� ������� ������
    }

    public List<News> getNews(NewsToDisplay watDisplay) {
        //TODO: ���������� ����������� ��� �� ����� ������� ������
        //TODO: ���������� ����������� �� ����� ����� ����� ������������ ������ ��������
        List<News> list = new ArrayList();
        list.add(new News("������", "��������", "���������� � ������ �����",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.add(new News("������", "��������", "���������� � ������ �����",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.add(new News("������", "��������", "���������� � ������ �����",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.add(new News("������", "��������", "���������� � ������ �����",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        list.add(new News("������", "��������", "���������� � ������ �����",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL"));
        return list;
    }
}
