package state;

public class MasterState extends State{
    public MasterState(Game game) {
        super(game);
    }

    public void action() {
        System.out.println("You are in the Master state.");
        System.out.println("Congratulations! You have completed the game.");
        System.out.println("Character Stats: Name:" + this.getGame().c.getName()+", HP:" + this.getGame().c.getHitPoints() + ", XP:" + this.getGame().c.getXp());

        System.exit(0);
    }

}
