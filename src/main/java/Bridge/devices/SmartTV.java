package Bridge.devices;

public class SmartTV implements Device {

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            volume = 100;
        } else if (percent < 0) {
            volume = 0;
        } else {
            volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("--------------------");
        System.out.println("| Smart TV: ");
        System.out.println("| TV is " + (on ? "enabled" : "disabled"));
        System.out.println("| Volume: " + volume + "%");
        System.out.println("| Channel: " + channel);
        System.out.println("--------------------");
    }

    public void browseInternet() {
        if (on) {
            System.out.println("Smart TV is browsing the internet.");
        } else {
            System.out.println("Turn on the Smart TV first.");
        }
    }
}