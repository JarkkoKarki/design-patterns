package template_method;

import java.util.ArrayList;
import java.util.Scanner;

public class FightGame extends Game {
    ArrayList<Player> players = new ArrayList<>();
    String resetColor = "\u001B[0m";
    String[] colors = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m"};
    Scanner s = new Scanner(System.in);


    @Override
    public void initializeGame(int numberOfPlayers) {

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Enter name for player " + i + ": ");
            String name = s.nextLine();
            new Player(name);
            players.add(new Player(name));
            System.out.println(colors[i % colors.length] + "Player " + i + " named " + name + " has entered the game.");
        }
    }


    @Override
    public boolean endOfGame() {
        return players.size() <= 1;
    }

    @Override
    public void playSingleTurn(int player) {
        if (player >= players.size()) {
            return;
        }

        System.out.println(colors[player % colors.length] + players.get(player).getName() + "'s turn to fight! Press Enter to attack." + resetColor);
        s.nextLine();
        System.out.println(colors[player % colors.length] + players.get(player).getName() + " attacks!" + resetColor);

        players.get(player).attack(players.get((player + 1) % players.size()));

        System.out.println(colors[player % colors.length] + players.get(player).Stats() + ",  " + colors[player + 1 % colors.length] + players.get((player + 1) % players.size()).Stats() + resetColor);
        checkPlayers();
    }

    @Override
    public void displayWinner() {
        if (players.size() == 1) {
            System.out.println(colors[players.indexOf(players.get(0)) % colors.length] + players.get(0).getName() + " is the winner!" + resetColor);
        } else {
            System.out.println("No winner.");
        }
    }

    private void checkPlayers() {
        if (players.size() == 1) {
            endOfGame();
        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getHealth() <= 0) {
                System.out.println(colors[i % colors.length] + players.get(i).getName() + " has been defeated!" + resetColor);
                players.remove(i);
                i--;
            }
        }

    }
}
