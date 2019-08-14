package io.guthub.eutkin.document;

public class YamlDocumentProcessor implements DocumentProcessor {


    @Override
    public <T> T process(String text) {
        return null;
    }

    @Override
    public Format getFormat() {
        return Format.YAML;
    }
}
