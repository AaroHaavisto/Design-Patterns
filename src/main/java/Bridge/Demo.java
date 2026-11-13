package Bridge;

import Bridge.devices.Device;
import Bridge.devices.Radio;
import Bridge.devices.Tv;
import Bridge.remotes.AdvancedRemote;
import Bridge.remotes.BasicRemote;
import Bridge.devices.SmartTV;
import Bridge.remotes.SmartRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        SmartTV smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);
        smartRemote.power();
        smartRemote.voiceControl();

        smartTV.browseInternet();
        smartTV.printStatus();
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

    }
}
