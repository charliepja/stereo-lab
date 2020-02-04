import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RadioTest {
    Radio radio1;

    @Before
    public void before() {
        this.radio1 = new Radio();
    }

    @Test
    public void startsWithNoTune() {
        assertNull(radio1.getTune());
    }

    @Test
    public void canSetTune() {
        radio1.setTune("Radio 1");
        assertEquals("Radio 1", radio1.getTune());
    }

    @Test
    public void canTurnOn(){
        assertEquals("This is on" , radio1.on());
    }
    @Test
    public void canTurnOff(){
        assertEquals("This is off", radio1.off());
    }
}
