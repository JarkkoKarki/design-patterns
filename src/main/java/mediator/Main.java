package mediator;

import mediator.view.Gui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username 1: ");
        String username1 = sc.nextLine();
        System.out.print("Username 2: ");
        String username2 = sc.nextLine();
        System.out.print("Username 3: ");
        String username3 = sc.nextLine();

        Gui.usernames = new String[]{username1, username2, username3};

        Gui.launch(Gui.class, args);
    }
}
