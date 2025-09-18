package proxy;

import java.util.Date;

public class Document implements IDocument {
    private final String content;
    private final String id;
    private final Date creationDate;

    public Document(String id, Date date, String content) {
        this.id = id;
        this.creationDate = date;
        this.content = content;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}
