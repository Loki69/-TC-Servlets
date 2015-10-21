package com.mycompany.storage.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DependingFileNews {

    public void writeFile(File fileForWriting, InputStream filecontent) throws FileNotFoundException, IOException {
        OutputStream out = new FileOutputStream(fileForWriting);
        int read = 0;
        final byte[] bytes = new byte[1024];

        while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        out.close();
        filecontent.close();
    }
}
