package state;

public class IntermediateState extends State {
    public IntermediateState(Game game) {
        super(game);
        this.getGame().setXpNeeded(250);
    }

    public void action() {
        System.out.println("\nYou are in the Intermediate state.");
        System.out.println("Your Level: " + this.getGame().c.getLevel());
        String[] options = { "Train", "Meditate" };
        int hp = this.getGame().c.getHitPoints();
        switch (this.getGame().readUserChoice(options)) {
            case 1:
                this.getGame().getXP();
                this.getGame().c.setHitPoints(hp-1);
                System.out.println("You trained and gained some XP!");
                System.out.println("Your HP: " + this.getGame().c.getHitPoints());
                break;
            case 2:
                this.getGame().c.setHitPoints(hp+10);
                System.out.println("You meditated and regained some HP!");
                System.out.println("Your HP: " + this.getGame().c.getHitPoints());
                this.getGame().c.setHitPoints(this.getGame().c.setMaxHitPoints(this.getGame().c.getMaxHitPoints()+5));
                break;
        };
        if (this.getGame().c.getXp() == this.getGame().getXpNeeded()) {
            System.out.println("You have entered the Expert state!");
            this.getGame().c.setLevel(this.getGame().c.getLevel()+1);
            this.getGame().setState(new ExpertState(this.getGame()));
        } else if (this.getGame().c.getHitPoints() <= 0) {
            System.out.println("You have died. Game over.");
            System.exit(0);
        }
    }
}