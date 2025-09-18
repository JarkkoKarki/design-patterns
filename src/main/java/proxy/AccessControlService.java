package proxy;

import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    static AccessControlService instance;
    private final Set<String> allowedUsers;

    private AccessControlService() {
        allowedUsers = new HashSet<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void allowAccess(String username, String docId) {
        allowedUsers.add(username + ":" + docId);
    }

    public boolean isAllowed(String username, String docId) {
        return allowedUsers.contains(username + ":" + docId);
    }
}
