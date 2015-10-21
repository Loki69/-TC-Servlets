package com.mycompany.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public class StroregeFoldersDependence {

    private final Logger log = Logger.getLogger(StroregeFoldersDependence.class);
    private final String pathStoreg = "c:\\tmp\\ConfigDependence.txt";

    public void addToStorege(String dependencePathe) {
        try {
            //attention to one record one line!
            Files.write(Paths.get(pathStoreg), dependencePathe.concat("\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            log.error(ex);
        }
    }

    public List<String> getPathToDependence() {
        log.info("PathToDependence");
        try {
            return Files.readAllLines(Paths.get(pathStoreg));
        } catch (IOException ex) {
            log.error(ex);
        }
        return Collections.emptyList();
    }
}
