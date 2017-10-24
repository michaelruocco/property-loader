package uk.co.mruoc.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileSystemFileContentLoader implements FileContentLoader {

    private InputStreamConverter converter = new InputStreamConverter();

    @Override
    public String loadContent(String path) {
        try (InputStream stream = new FileInputStream(new File(path))) {
            return converter.toString(stream);
        } catch (IOException | NullPointerException e) {
            throw new FileContentLoadException(path, e);
        }
    }

}