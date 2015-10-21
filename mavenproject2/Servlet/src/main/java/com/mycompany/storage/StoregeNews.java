package com.mycompany.storage;

import com.mycompany.admin.orpions.OptionsSelection;
import com.mycompany.structure.data.News;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class StoregeNews {

    private Logger log = Logger.getLogger(StoregeNews.class);

    public void addToStorege(News list) {
        log.info("try add new data");
        log.info("add data Successfully");
    }

    public List<News> getNews(OptionsSelection watDisplay) {
        log.info("getNews");
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
