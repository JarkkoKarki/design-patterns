package state;

public class NoviceState extends State{
    public NoviceState(Game game) {
        super(game);
        this.getGame().resetXP();
    }
}
