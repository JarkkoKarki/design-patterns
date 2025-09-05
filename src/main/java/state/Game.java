package state;

import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    private int xpNeeded = 100;
    private int xp = 0;

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

    public void resetXP() {
        xp = 0;
    }

}
