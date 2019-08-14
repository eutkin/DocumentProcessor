package io.guthub.eutkin.document;

public class JsonDocumentProcessor implements DocumentProcessor {


    @Override
    public <T> T process(String text) {
        return null;
    }

    @Override
    public Format getFormat() {
        return Format.JSON;
    }
}
