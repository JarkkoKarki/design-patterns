package prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    String targetAudience;
    List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Recommendation clone() {
        Recommendation cloned = new Recommendation(this.targetAudience);
        for (Book book : this.books) {
            cloned.addBook(book.clone());
        }
        return cloned;
    }

    public void display() {
        System.out.println("Recommendation for: " + targetAudience);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showRecommendation() {
        System.out.println("Recommendations for " + targetAudience + ":");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (genre: " + book.getGenre() + "), (published: " + book.getPublicationYear() + ")");
        }
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }
}
