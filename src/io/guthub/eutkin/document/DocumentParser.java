package io.guthub.eutkin.document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

public class DocumentParser {

    private final EnumMap<Format, DocumentProcessor> processors = new EnumMap<>(Format.class);

    public DocumentParser(Collection<DocumentProcessor> processors) {
        if (processors != null) {
            for (DocumentProcessor processor : processors) {
                this.processors.put(processor.getFormat(), processor);
            }
        }
    }

    public <T> T parse(String fileName) throws IOException {
        final String content = Files.readString(Path.of(fileName));
        final Format format = detectFormat(content);
        final DocumentProcessor documentProcessor = processors.get(format);
        return documentProcessor.process(content);
    }

    private Format detectFormat(String content) {
        final Format[] formats = Format.values();
        return formats[ThreadLocalRandom.current().nextInt(0, formats.length)];
    }
}
