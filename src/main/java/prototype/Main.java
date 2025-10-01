package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Recommendation> recommendations = new ArrayList<>();

        // Default recommendation
        Recommendation rec1 = new Recommendation("Young Adults");
        rec1.addBook(new Book("J.K. Rowling", "Harry Potter", "Fantasy", 1997));
        rec1.addBook(new Book("Suzanne Collins", "The Hunger Games", "Dystopian", 2008));
        recommendations.add(rec1);

        while (true) {
            System.out.println("\nBook Recommendations");
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone Recommendation List");
            System.out.println("3. Add Book to Recommendation");
            System.out.println("4. Remove Book from Recommendation");
            System.out.println("5. Change Target Audience");
            System.out.println("6. Exit");

            System.out.print("Select option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":  // Haetaan suositukset
                    System.out.println("\n__________________________________________________");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i).targetAudience);
                        recommendations.get(i).display();
                    }
                    break;

                case "2": // Kloonataan suosituslista
                    System.out.println("__________________________________________________");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i).targetAudience);
                        recommendations.get(i).display();
                    }

                    System.out.print("Enter recommendation index to clone: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < recommendations.size()) {
                        Recommendation cloned = recommendations.get(index).clone(); // kloonataan indeksin mukaan
                        System.out.print("Enter new target audience for cloned list: ");
                        cloned.targetAudience = scanner.nextLine(); // asetetaan uusi kohdeyleisö
                        recommendations.add(cloned); // lisätään kloonattu lista
                        System.out.println("Cloned recommendation created successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "3": // Lisätään kirja suositukseen
                    System.out.println("__________________________________________________");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i).targetAudience);
                        recommendations.get(i).display();
                    }
                    System.out.print("Enter recommendation index to add book to: ");
                    int indexB = Integer.parseInt(scanner.nextLine());
                    if (indexB >= 0 && indexB < recommendations.size()) {
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Publication Year: ");
                        int year = Integer.parseInt(scanner.nextLine());
                        recommendations.get(indexB).addBook(new Book(author, title, genre, year));
                        System.out.println("Book added.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "4": // Poistetaan kirja suosituksesta
                    System.out.println("__________________________________________________");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i).targetAudience);
                        recommendations.get(i).display();
                    }
                    System.out.print("Enter recommendation index to remove book from: ");
                    int idxRemove = Integer.parseInt(scanner.nextLine());
                    if (idxRemove >= 0 && idxRemove < recommendations.size()) {
                        System.out.print("Enter book title to remove: ");
                        String titleRemove = scanner.nextLine();
                        recommendations.get(idxRemove).books.removeIf(book -> book.getTitle().equalsIgnoreCase(titleRemove));
                        System.out.println("Book removed if it existed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "5": // Muutetaan kohdeyleisöä
                    System.out.println("__________________________________________________");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println("[" + i + "] " + recommendations.get(i).targetAudience);
                        recommendations.get(i).display();
                    }
                    System.out.print("Enter recommendation index to change audience: ");
                    int indexA = Integer.parseInt(scanner.nextLine());
                    if (indexA >= 0 && indexA < recommendations.size()) {
                        System.out.print("New target audience: ");
                        recommendations.get(indexA).targetAudience = scanner.nextLine();
                        System.out.println("Target audience updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "6":
                    System.out.println("__________________________________________________");
                    scanner.close();
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }
}
