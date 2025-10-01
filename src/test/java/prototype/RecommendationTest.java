package prototype;


import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class RecommendationTest {

    @Test
    public void testBookClone() {
        Book original = new Book("George Orwell", "1984", "Fantasy", 1949);
        Book cloned = original.clone();
        assertNotSame("Eri olio", original, cloned);
        assertEquals(original.getTitle(), cloned.getTitle());
        assertEquals(original.getAuthor(), cloned.getAuthor());
        assertEquals(original.getGenre(), cloned.getGenre());
        assertEquals(original.getPublicationYear(), cloned.getPublicationYear());
    }
    @Test
    public void testRecommendationClone() {
        Recommendation original = new Recommendation("Senior");
        original.addBook(new Book("George Orwell", "1984", "Fantasy", 1949));
        original.addBook(new Book("Harper Lee", "To Kill a Mockingbird", "Fiction", 1960));
        Recommendation cloned = original.clone();
        assertNotSame("Eri olio", original, cloned);

        assertEquals("Sama sisältö", original.getTargetAudience(), cloned.getTargetAudience());

        assertNotSame("Varmistetaan että listat ovat eri objektis", original.books, cloned.books);
        assertEquals("Identtinen sisältö Suosituksilla", original.books.size(), cloned.books.size());

        for (int i = 0; i < original.books.size(); i++) {
            Book originalBook = original.books.get(i);
            Book clonedBook = cloned.books.get(i);
            assertNotSame("Varmistetaan, että jokainen kirja on syväkopioitu", originalBook, clonedBook);
            assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        }
    }

    @Test
    public void testAddBook() {
        Recommendation recommendation = new Recommendation("Adult");
        Book book = new Book("F. Scott Fitzgerald", "The Great Gatsby", "Fiction", 1925);;
        recommendation.addBook(book);
        assertTrue(recommendation.books.contains(book));
    }

    @Test
    public void removeBook() {
        Recommendation recommendation = new Recommendation("Adult");
        Book book = new Book("F. Scott Fitzgerald", "The Great Gatsby", "Fiction", 1925);;
        recommendation.addBook(book);
        recommendation.removeBook(book);
        assertFalse(recommendation.books.contains(book));
    }

    @Test
    public void testChangeTargetAudience() {
        Recommendation recommendation = new Recommendation("Adult");
        recommendation.targetAudience = "Young Adult";
        assertEquals("Young Adult", recommendation.getTargetAudience());
    }

}