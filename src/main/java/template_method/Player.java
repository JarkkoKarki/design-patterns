package template_method;

public class Player {
    private String name;
    private int health;
    private int maxHealth;

    public Player(String name) {
        this.name = name;
        this.health = 50;
        this.maxHealth = 50;
    }

    public void attack(Player player) {
        int dmg = (int) (Math.random() * 10) + 1;
        player.health -= dmg;
        System.out.println(this.name + " attacks " + player.name + " for " + dmg + " damage.");
    }

    public String Stats() {
        return this.name + " - Health: " + this.health + "/" + this.maxHealth;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }
}
