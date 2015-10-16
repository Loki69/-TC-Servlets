package com.mycompany.news.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnecter {

    private URL url;

    public HttpConnecter(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public String getDataFromPage() {
        HttpURLConnection con = null;
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder("");
        try {
            con = (HttpURLConnection) url.openConnection();
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return sb.toString();
    }
}
