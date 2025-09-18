package proxy;


import java.util.Date;

public interface IDocument {
    String getId();
    Date getCreationDate();
    String getContent(User user) throws AccessDeniedException;
}
