package proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<String, IDocument> documents = new HashMap<>();


    public void addUnprotected(String id, String content) {
        Document document = new Document(id, new Date(), content);
        documents.put(id, document);
    }

    public void addProtected(String id, String content, List<String> allowedUsers) {

        Document document = new Document(id, new Date(), content);
        DocumentProxy proxy = new DocumentProxy(document);

        AccessControlService acs = AccessControlService.getInstance();
        for (String user : allowedUsers) {
            acs.allowAccess(user, id);
        }

        documents.put(id, proxy);

    }

    public IDocument getDocument(String id) {
        return documents.get(id);
    }
}
