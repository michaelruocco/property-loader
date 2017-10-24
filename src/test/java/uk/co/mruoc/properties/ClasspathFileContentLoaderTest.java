package uk.co.mruoc.properties;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClasspathFileContentLoaderTest {

    private static final String NEW_LINE = System.lineSeparator();
    private final FileContentLoader loader = new ClasspathFileContentLoader();

    @Test
    public void shouldReturnFileContent() {
        String expectedContent = "firstName=MICHAEL" + NEW_LINE + "surname=RUOCCO";
        String path = "/test/classpath.properties";

        String content = loader.loadContent(path);

        System.out.println(content);
        assertThat(content).isEqualTo(expectedContent);
    }

    @Test(expected = FileContentLoadException.class)
    public void shouldErrorIfFileDoesNotExist() {
        String path = "/invalid/file-system.properties";

        loader.loadContent(path);
    }

}
