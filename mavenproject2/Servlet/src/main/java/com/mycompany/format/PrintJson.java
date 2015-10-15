package com.mycompany.format;

import com.mycompany.structure.NewsList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

public class PrintJson extends printFormat {

    private JsonArray jsonArray;

    public PrintJson() {
        
    }

    @Override
    public void generatPrint(NewsList news) {
        jsonArray = new JsonArray();
        
    }

    private String toJson(News news) {
        return String.format("{}", news.CATEGORY, news.TITLE);
    }

    @Override
    public String print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
