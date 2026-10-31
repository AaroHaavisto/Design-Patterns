package Proxy;

import java.time.LocalDate;

public class DocumentProxy implements IDocument {
    private Document document;
    private AccessControlService accessControlService;

    public DocumentProxy(Document document) {
        this.document = document;
        this.accessControlService = AccessControlService.getInstance();
    }

    @Override
    public String getId() {
        return document.getId();
    }

    @Override
    public LocalDate getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public String getContent(User user) {
        if (accessControlService.isAllowed(
                document.getId(), user.getUsername())) {
            return document.getContent(user);
        }

        throw new AccessDeniedException(
                "Access denied to document: " + document.getId());
    }
}