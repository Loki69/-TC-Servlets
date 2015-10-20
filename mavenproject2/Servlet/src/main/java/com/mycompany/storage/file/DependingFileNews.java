package com.mycompany.storage.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;

public class DependingFileNews {

    private OutputStream out;

    public String getResult(String fileName, String path, InputStream filecontent) throws ServletException, IOException {
        StringBuilder result = new StringBuilder();
        try {
            System.out.println(path);
            System.out.println(path);
            out = new FileOutputStream(new File(path + File.separator + fileName));

            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            return result.append("New file ").append(fileName)
                    .append(" created at ")
                    .append(path).toString();

        } catch (FileNotFoundException fne) {
            result.append("You either did not specify a file to upload ")
                    .append("or are trying to upload a file to a")
                    .append(" protected or nonexistent location.")
                    .append("\n<br/> ERROR: ")
                    .append(fne.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
            return result.toString();
        }
    }

}
