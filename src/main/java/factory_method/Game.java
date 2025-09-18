package factory_method;

import factory_method.maps.CityMap;
import factory_method.maps.WildernessMap;

import java.util.Scanner;

public class Game {

    public Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("city")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("wilderness")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.print("Enter map type (city/wilderness): ");
        String type = scanner.nextLine();

        System.out.print("Enter map width: ");
        int width = scanner.nextInt();

        System.out.print("Enter map height: ");
        int height = scanner.nextInt();

        Map map = game.createMap(type, width, height);
        System.out.println("\nGenerated " + type.substring(0, 1).toUpperCase() + type.substring(1) + " Map:");
        map.display();
    }
}
