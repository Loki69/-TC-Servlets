package com.mycompany.format;

import com.mycompany.structure.data.News;
import com.mycompany.structure.NewsList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class PrintJson extends PrintFormat {
//

    private JSONObject jsonResult;
//

    public PrintJson(NewsList news) {
        generatPrint(news);
    }

    private void generatPrint(NewsList news) {
        jsonResult = new JSONObject();
        jsonResult.put("news", toJsonArray(news));
    }

    private JSONArray toJsonArray(NewsList news) {
        JSONArray array = new JSONArray();
        List<News> resors = news.getList();
        for (News resor : resors) {
            array.put(toJson(resor));
        }
        return array;
    }

    private JSONObject toJson(News news) {
        JSONObject obj = new JSONObject();
        obj.put("catalog", news.CATEGORY)
                .put("title", news.TITLE)
                .put("publisheDate", news.PUBLISHED_DATE)
                .put("source", news.SOURCE)
                .put("images", Arrays.toString(news.IMAGES));
        return obj;
    }

    @Override
    public String print() {
        return jsonResult.toString();
    }

}
