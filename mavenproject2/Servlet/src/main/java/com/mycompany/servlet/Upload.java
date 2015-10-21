package com.mycompany.servlet;

import com.mycompany.storage.file.DependingFileNews;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.log4j.Logger;

@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
@MultipartConfig(location = "C:\\tmp", fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class Upload extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) {
        Logger log = Logger.getLogger(News.class);
        try {
            response.setContentType("text/html;charset=UTF-8");
            final String path = request.getParameter("destination");
            final Part filePart = request.getPart("file");
            final String fileName = getFileName(filePart);
            
            log.info("Upload: " + fileName);
            DependingFileNews dependensi = new DependingFileNews();
            dependensi.writeFile(new File(path + File.separator + fileName), filePart.getInputStream());
            log.info("Upload Successfully");
            
            response.sendRedirect("/Servlet");
        } catch (IOException | ServletException ex) {
            log.error(ex);
        }
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return "";
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
