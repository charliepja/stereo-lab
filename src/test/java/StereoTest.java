import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    private Stereo stereo1;

    @Before
    public void before() {
        this.stereo1 = new Stereo("Beep Beep");
    }

    @Test
    public void canGetName() {
        assertEquals("Beep Beep", stereo1.getName());
    }

    @Test
    public void canGetVolume() {
        assertEquals(0, stereo1.getVolume());
    }

    @Test
    public void canTurnUpVolume() {
        stereo1.turnUpVolume(2);
        assertEquals(2, stereo1.getVolume());
    }

    @Test
    public void canTurnDownVolume() {
        stereo1.turnUpVolume(4);
        stereo1.turnDownVolume(2);
        assertEquals(2, stereo1.getVolume());
    }

    @Test
    public void canTurnOn() {
        Radio radio1 = new Radio();
        stereo1.turnOn(radio1);
        assertEquals(true, radio1.getStatus());
    }

    @Test
    public void canTurnOff() {
        Radio radio1 = new Radio();
        stereo1.turnOn(radio1);
        stereo1.turnOff(radio1);
        assertEquals(false, radio1.getStatus());
    }
}
