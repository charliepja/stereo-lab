package components;

public class Radio extends Component{
    private String tune;

    public String getTune() {
        return this.tune;
    }

    public void setTune(String tune) {
        this.tune = tune;
    }


    public String on(){
        return "This is on";
    }

    public String off(){
        return "This is off";
    }
}
