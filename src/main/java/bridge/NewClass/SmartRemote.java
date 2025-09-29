package bridge.NewClass;

import bridge.Device;
import bridge.Remote;

public class SmartRemote extends Remote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Executing voice command: " + command);
        if (command.equalsIgnoreCase("browse internet") && device instanceof SmartTV) {
            ((SmartTV) device).browseInternet();
        }
    }
}