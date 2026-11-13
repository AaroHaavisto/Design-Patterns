package Bridge.remotes;

import Bridge.devices.Device;

public class SmartRemote extends BasicRemote {

    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("Remote: voice control activated");
        device.setVolume(50);
    }
}