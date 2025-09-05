package state;

public class NoviceState extends State{
    public NoviceState(Game game) {
        super(game);
    }

    int hp = this.getGame().c.getHitPoints();
    int xpNeeded = this.getGame().getXpNeeded();

    public void action() {
        System.out.println("\nYou are in the Novice state.");
        System.out.println("Your Level: " + this.getGame().c.getLevel());
        String[] options = { "Train" };
        switch (this.getGame().readUserChoice(options)) {
            case 1:
                this.getGame().getXP();
                this.getGame().c.setHitPoints(hp-1);
                System.out.println("You trained and gained some XP!");
                System.out.println("Your HP: " + hp);
        };
        if (this.getGame().getXP() == xpNeeded) {
            System.out.println("You have entered the Intermediate state!");
            this.getGame().c.setLevel(this.getGame().c.getLevel()+1);
            this.getGame().setState(new IntermediateState(this.getGame()));
        } else if (this.getGame().c.getHitPoints() <= 0) {
            System.out.println("You have died. Game over.");
            System.exit(0);
        }
    }
}
