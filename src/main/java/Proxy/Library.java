package Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addPublicDocument(String id, String content) {
        checkId(id);

        Document document = new Document(id, content);
        documents.put(id, document);
    }

    public void addProtectedDocument(String id, String content) {
        checkId(id);

        Document document = new Document(id, content);
        DocumentProxy proxy = new DocumentProxy(document);

        documents.put(id, proxy);
    }

    public IDocument getDocument(String id) {
        return documents.get(id);
    }

    private void checkId(String id) {
        if (documents.containsKey(id)) {
            throw new IllegalArgumentException(
                    "Document ID already exists: " + id);
        }
    }
}