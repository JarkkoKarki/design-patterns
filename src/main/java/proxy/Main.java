package proxy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        library.addUnprotected("doc1", "Public");
        library.addProtected("doc2", "Secret", Arrays.asList("user1", "user2"));
        library.addProtected("doc3", "Confidential", Arrays.asList("user3"));

        try {
            System.out.println("User1 reads doc1: " + library.getDocument("doc1").getContent(user1));
            System.out.println("User1 reads doc2: " + library.getDocument("doc2").getContent(user1));
            System.out.println("User2 reads doc2: " + library.getDocument("doc2").getContent(user2));
            System.out.println("user3 reads doc2: " + library.getDocument("doc2").getContent(user3));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("user3 reads doc3: " + library.getDocument("doc3").getContent(user3));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}