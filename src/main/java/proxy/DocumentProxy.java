package proxy;

import java.util.Date;

public class DocumentProxy implements IDocument {
    private final Document realDocument;
    private final AccessControlService acs;

    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
        this.acs = AccessControlService.getInstance();
    }

    @Override
    public String getId() {
        return realDocument.getId();
    }

    @Override
    public Date getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (acs.isAllowed(user.getUsername(), realDocument.getId())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied: " + user.getUsername() + " to " + realDocument.getId());
        }
    }
}
