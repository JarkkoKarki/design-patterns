package state;

public class Character {

    private String name;
    private int xp;
    private int xpNeeded;
    private int hitPoints;
    private int MaxHitPoints;
    private int level;

    public Character(String name, int xpNeeded, int maxHitPoints) {
        this.name = name;
        this.xpNeeded = xpNeeded;
        this.MaxHitPoints = maxHitPoints;
        this.hitPoints = maxHitPoints;
        this.xp = 0;
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public int getXp() {
        return xp;
    }
    public void addXp(int amount) {
        this.xp += amount;
    }
    public int getXpNeeded() {
        return xpNeeded;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = Math.min(hitPoints, MaxHitPoints);
    }
    public int getMaxHitPoints() {
        return MaxHitPoints;
    }
    public int setMaxHitPoints(int maxHitPoints) {
        return MaxHitPoints = maxHitPoints;
    }
    public void setXpNeeded(int xpNeeded) {
        this.xpNeeded = xpNeeded;
    }
}
