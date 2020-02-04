import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer1;

    @Before
    public void before() {
        this.cdPlayer1 = new CDPlayer("JVC", "BR0K3");
    }

    @Test
    public void canGetMake() {
        assertEquals("JVC", cdPlayer1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("BR0K3", cdPlayer1.getModel());
    }

    @Test
    public void canSetTape() {
        cdPlayer1.setCD("The Wall");
        assertEquals("The Wall", cdPlayer1.getCD());
    }

    @Test
    public void canPlay() {
        cdPlayer1.setCD("The Wall");
        assertEquals("The Wall is currently playing track 1", cdPlayer1.play());
    }

    @Test
    public void canPause() {
        cdPlayer1.setCD("The Wall");
        assertEquals("The Wall has been paused!", cdPlayer1.pause());
    }

    @Test
    public void canStop() {
        cdPlayer1.setCD("The Wall");
        assertEquals("The Wall has now stopped!", cdPlayer1.stop());
    }

    @Test
    public void canSkipTrack(){
        cdPlayer1.setCD("The Wall");
        cdPlayer1.skipTrack();
        assertEquals("The Wall is currently playing track 2", cdPlayer1.play());
    }

    @Test
    public void canTurnOn(){
        assertEquals("This is on" , cdPlayer1.on());
    }
    @Test
    public void canTurnOff(){
        assertEquals("This is off", cdPlayer1.off());
    }


}
