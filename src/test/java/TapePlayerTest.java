import components.TapePlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapePlayerTest {
    private TapePlayer tapePlayer1;

    @Before
    public void before() {
        this.tapePlayer1 = new TapePlayer("Sony", "WC175");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", tapePlayer1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("WC175", tapePlayer1.getModel());
    }

    @Test
    public void canSetTape() {
        tapePlayer1.setTape("Backstreet Boys");
        assertEquals("Backstreet Boys", tapePlayer1.getTape());
    }

    @Test
    public void canPlay() {
        tapePlayer1.setTape("Backstreet Boys");
        assertEquals("Backstreet Boys is currently playing!", tapePlayer1.play());
    }

    @Test
    public void canPause() {
        tapePlayer1.setTape("Backstreet Boys");
        assertEquals("Backstreet Boys has been paused!", tapePlayer1.pause());
    }

    @Test
    public void canStop() {
        tapePlayer1.setTape("Backstreet Boys");
        assertEquals("Backstreet Boys has now stopped!", tapePlayer1.stop());
    }
    @Test
    public void canTurnOn(){
        assertEquals("This is on" , tapePlayer1.on());
    }
    @Test
    public void canTurnOff(){
        assertEquals("This is off", tapePlayer1.off());
    }
}
