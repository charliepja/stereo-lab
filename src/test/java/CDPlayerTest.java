import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer CDPlayer1;

    @Before
    public void before() {
        this.CDPlayer1 = new CDPlayer("JVC", "BR0K3");
    }

    @Test
    public void canGetMake() {
        assertEquals("JVC", CDPlayer1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("BR0K3", CDPlayer1.getModel());
    }

    @Test
    public void canSetTape() {
        CDPlayer1.setCD("The Wall");
        assertEquals("The Wall", CDPlayer1.getCD());
    }

    @Test
    public void canPlay() {
        CDPlayer1.setCD("The Wall");
        assertEquals("The Wall is currently playing track 1", CDPlayer1.play());
    }

    @Test
    public void canPause() {
        CDPlayer1.setCD("The Wall");
        assertEquals("The Wall has been paused!", CDPlayer1.pause());
    }

    @Test
    public void canStop() {
        CDPlayer1.setCD("The Wall");
        assertEquals("The Wall has now stopped!", CDPlayer1.stop());
    }

    @Test
    public void canSkipTrack(){
        CDPlayer1.setCD("The Wall");
        CDPlayer1.skipTrack();
        assertEquals("The Wall is currently playing track 2", CDPlayer1.play());
    }

    @Test
    public void canTurnOn(){
        assertEquals("This is on" , CDPlayer1.on());
    }
    @Test
    public void canTurnOff(){
        assertEquals("This is off", CDPlayer1.off());
    }


}
