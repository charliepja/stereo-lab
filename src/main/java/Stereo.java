import components.*;

public class Stereo {
    private String name;
    private int volume;

    public Stereo(String name) {
        this.name = name;
        this.volume = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }

    public void turnUpVolume(int newVolume) {
        this.volume += newVolume;
    }

    public void turnDownVolume(int newVolume) {
        this.volume -= newVolume;
    }

    public void turnOn(Component newComponent) {
        newComponent.on();
    }

    public void turnOff(Component newComponent) {
        newComponent.off();
    }
}
