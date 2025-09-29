package bridge;

public class Tv implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnabled() { return on; }

    @Override
    public void enable() {
        on = true;
        System.out.println("TV is now ON");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("TV is now OFF");
    }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Volume is now " + volume);
    }

    @Override
    public int getChannel() { return channel; }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel is now " + channel);
    }
}
