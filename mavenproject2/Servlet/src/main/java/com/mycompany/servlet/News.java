package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class News extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("{\n" +
"    category: \"career\",\n" +
"    title: \"EPAM Educational Programs in Solution Architecture\",\n" +
"    description: \"EPAM’S CTO office has been growing Solution Architecture (SA) as a discipline in a systematized and centralized way since 2014. A number of educational activities for Solution Architects have already been launched, and more are in the pipeline. Let’s have a closer look at what’s available.\",\n" +
"    images: [\"http://info.epam.com/content/dam/infoepam/editorial/photo/2015/sau_heading.jpg\"],\n" +
"    publishedDate: \"09.10.2015 11:23:00\",\n" +
"    priority: 1,\n" +
"    author: \"none\",\n" +
"    fullVersionLink: \"http://info.epam.com/en/news/career/2015/solution-architecture.htmlEPAM_Educational_Programs_in_Solution_Architecture\",\n" +
"    source: \"info.epam.com\"\n" +
"}");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
