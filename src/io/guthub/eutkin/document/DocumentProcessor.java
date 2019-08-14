package io.guthub.eutkin.document;


import org.w3c.dom.DocumentType;

public interface DocumentProcessor {

    <T> T process(String text);

    Format getFormat();

}
