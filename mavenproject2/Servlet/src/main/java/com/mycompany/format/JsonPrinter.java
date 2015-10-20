package com.mycompany.format;

import com.mycompany.structure.data.News;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonPrinter implements FormatPrinter {

    private JSONObject jsonResult;

    public JsonPrinter(List<News> news) {
        generatPrint(news);
    }

    private void generatPrint(List<News> news) {
        jsonResult = new JSONObject();
        jsonResult.put("news", toJsonArray(news));
    }

    private JSONArray toJsonArray(List<News> news) {
        JSONArray array = new JSONArray();
        for (News resor : news) {
            array.put(toJson(resor));
        }
        return array;
    }

    private JSONObject toJson(News news) {
        JSONObject obj = new JSONObject();
        obj.put("catalog", news.category)
                .put("title", news.title)
                .put("publisheDate", news.publishedDate)
                .put("source", news.source)
                .put("images", Arrays.toString(news.images));
        return obj;
    }

    public String print() {
        return jsonResult.toString();
    }

}
