package uk.co.mruoc.file.content;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Base64FileContentLoaderTest {

    private final FileContentLoader cannedLoader = new CannedFileContentLoader();
    private final FileContentLoader loader = new Base64FileContentLoader(cannedLoader);

    @Test
    public void shouldReturnBase64EncodedFileContent() {
        String expectedContent = "Y2FubmVkIGZpbGUgY29udGVudA==";

        String content = loader.loadContent("any/path");

        assertThat(content).isEqualTo(expectedContent);
    }

}