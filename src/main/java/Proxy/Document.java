package Proxy;

import java.time.LocalDate;

public class Document implements IDocument {
    private String id;
    private LocalDate creationDate;
    private String content;

    public Document(String id, String content) {
        this.id = id;
        this.creationDate = LocalDate.now();
        this.content = content;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}