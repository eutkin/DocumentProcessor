package io.guthub.eutkin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class DocumentProcessor {

    enum DocumentType {
        HTML,
        XML
    }

    public DocumentProcessor() {

    }

    public void ProcessDocumentFromFile(String documentFilepath) throws IOException {
        String content = Files.readString(Paths.get(documentFilepath), StandardCharsets.UTF_8);
        ProcessDocument(content);
    }

    public void ProcessDocument(String text) {
        var documentType = getDocumentType(text);

        if (documentType == null) {
            throw new RuntimeException("Cannot detect document type");
        }
        if (documentType == DocumentType.XML) {
            processXmlDocument(text);
        }
        if (documentType == DocumentType.HTML) {
            processHtmlDocument(text);
        }
    }

    private DocumentType getDocumentType(String text) {
        return DocumentType.HTML;
    }

    private void processXmlDocument(String text) {
        // обработка документов типа XML
    }

    private void processHtmlDocument(String text) {
        // обработка документов типа HTML
    }
}
