package state;

import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    Character c = new Character("Tonttu", 100, 50);



    public Game() {
        state = new NoviceState(this);
    }

    public void start() {
        while (true) {
            if (state == null) {
                System.out.println("Error");
            }
            state.action();
        }
    }

    public int getXP() {
        c.setHitPoints(c.getHitPoints()-1);
        c.addXp(10);
        System.out.println("Your XP: " + c.getXp() + "/ " + c.getXpNeeded());
        return c.getXp();
    }

    public int getXpNeeded() {
        return c.getXpNeeded();
    }

    public int readUserChoice(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }


    public void setState(State state) {
        this.state = state;
    }

    public void setXpNeeded(int xpNeeded) {
        c.setXpNeeded(xpNeeded);
    }


}
