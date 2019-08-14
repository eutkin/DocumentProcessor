package io.guthub.eutkin.document;

public class HtmlDocumentProcessor implements DocumentProcessor {

    @Override
    public <T> T process(String text) {
        return null;
    }

    @Override
    public Format getFormat() {
        return Format.HTML;
    }
}
