package com.mycompany.servlet;

import com.mycompany.storage.StroregeFoldersDependence;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class Upload extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) {
        Logger log = Logger.getLogger(Upload.class);
        try {
            response.setContentType("text/html;charset=UTF-8");
            final String path = request.getParameter("destination");

            log.info("Upload: " + path);
            new StroregeFoldersDependence().addToStorege(path);
            log.info("Upload Successfully");

            response.sendRedirect("/Servlet");
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
