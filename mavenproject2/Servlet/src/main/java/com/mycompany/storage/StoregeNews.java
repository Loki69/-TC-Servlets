package com.mycompany.storage;

import com.mycompany.structure.data.News;
import java.util.ArrayList;
import java.util.List;

public class StoregeNews {

    public void addToStorege(News list) {
    }

    public List<News> getNews() {
        List<News> list = new ArrayList();
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        list.add(new News("sdfg", "sdsdgfsd", "sfff fffd zzxc",
                new String[]{"SDSG", "ASDFGSDF", "SDG"},
                "1.1.15", "12312", "PAVEL", "ru"));
        return list;
    }
}
