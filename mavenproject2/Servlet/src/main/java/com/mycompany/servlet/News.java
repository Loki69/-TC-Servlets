package com.mycompany.servlet;

import com.mycompany.admin.NewsToDisplay;
import com.mycompany.format.PrintFormat;
import com.mycompany.format.PrintJson;
import com.mycompany.storage.Storege;
import com.mycompany.structure.NewsList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "News", urlPatterns = {"/News"})
public class News extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            NewsToDisplay displ = new NewsToDisplay();
            Storege storeg = new Storege();
            NewsList list = storeg.getNews(displ);            
            PrintJson pf = new PrintJson(list);
            out.println(pf.print());
            
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
