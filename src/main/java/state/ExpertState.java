package state;

public class ExpertState extends State{

    public ExpertState(Game game) {
        super(game);
        this.getGame().setXpNeeded(500);
    }


    public void action() {
        System.out.println("\nYou are in the Expert state.");
        System.out.println("Your Level: " + this.getGame().c.getLevel());
        String[] options = { "Train", "Meditate", "Fight" };
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
            case 3:
                this.getGame().c.setHitPoints(hp-30);
                this.getGame().c.addXp(20);
                System.out.println("You fought and gained some XP but lost some HP!");
                System.out.println("Your HP: " + this.getGame().c.getHitPoints());
                break;
        };
        if (this.getGame().c.getXp() == this.getGame().getXpNeeded()) {
            System.out.println("You have entered the Master state!");
            this.getGame().c.setLevel(this.getGame().c.getLevel()+1);
            this.getGame().setState(new MasterState(this.getGame()));
        } else if (this.getGame().c.getHitPoints() <= 0) {
            System.out.println("You have died. Game over.");
            System.exit(0);
        }
    }
}
