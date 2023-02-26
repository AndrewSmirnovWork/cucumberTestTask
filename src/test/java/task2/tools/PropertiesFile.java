package task2.tools;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFile {

    private static final Logger LOG = LogManager.getLogger(PropertiesFile.class);
    private static FileInputStream fileInputStream;
    private static Properties properties = null;

    public static String getProperty(String property) {

        try {
            fileInputStream = new FileInputStream(new File("config.properties"));
            properties = new Properties();
            properties.load(fileInputStream);
        } catch(FileNotFoundException fnfe) {
            LOG.error("Properties File Not Found", fnfe);
        } catch(IOException ioe) {
            LOG.error("IO Exception while loading Properties File", ioe);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                LOG.error("IO Exception while closing file input stream", e);
            }
        }
        return properties.getProperty(property).trim();
    }
}
