package uk.co.mruoc.properties;

public class ClasspathBase64FileContentLoader extends Base64FileContentLoader {

    public ClasspathBase64FileContentLoader() {
        super(new ClasspathFileContentLoader());
    }

}
