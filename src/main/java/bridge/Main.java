package bridge;

import bridge.NewClass.SmartRemote;
import bridge.NewClass.SmartTV;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();
        remote.volumeUp();

        Device radio = new Radio();
        AdvancedRemote advRemote = new AdvancedRemote(radio);
        advRemote.togglePower();
        advRemote.mute();

        System.out.println("----------------------------------------");

        Device smartTv = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTv);

        smartRemote.togglePower();
        smartRemote.volumeUp();
        smartRemote.voiceControl("browse internet");
    }
}
