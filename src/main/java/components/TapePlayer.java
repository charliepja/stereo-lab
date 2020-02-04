package components;

public class TapePlayer extends Component implements IPlay  {
    private String make;
    private String model;
    private String tape;
    private Boolean status;

    public TapePlayer(String make, String model) {
        this.make = make;
        this.model = model;
        this.status = false;
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

    public Boolean getStatus() {
        return this.status;
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
        this.status = true;
        return "This is on";
    }
    public String off(){
        this.status = false;
        return "This is off";
    }
}
