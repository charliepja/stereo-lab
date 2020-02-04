package components;

public class TapePlayer extends Component implements IPlay  {
    private String make;
    private String model;
    private String tape;

    public TapePlayer(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getTape() {
        return this.tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public String play() {
        return this.tape + " is currently playing!";
    }

    public String pause() {
        return this.tape + " has been paused!";
    }

    public String stop() {
        return this.tape + " has now stopped!";
    }

    public String on(){
        return "This is on";
    }
    public String off(){
        return "This is off";
    }
}
