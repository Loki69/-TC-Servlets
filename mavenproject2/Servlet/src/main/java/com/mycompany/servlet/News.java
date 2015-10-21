package com.mycompany.servlet;

import com.mycompany.admin.NewsToDisplay;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

@WebServlet(name = "News", urlPatterns = {"/News"})
public class News extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        Logger log = Logger.getLogger(News.class);
        try (PrintWriter out = response.getWriter()) {
            NewsToDisplay displ = new NewsToDisplay();
            out.println(displ.printJson());
            log.info("request News API from JSON");
        } catch (IOException ex) {
            log.error(ex);
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
