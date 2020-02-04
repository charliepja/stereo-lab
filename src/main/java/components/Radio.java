package components;

public class Radio extends Component{
    private String tune;
    private Boolean status = false;

    public String getTune() {
        return this.tune;
    }

    public void setTune(String tune) {
        this.tune = tune;
    }

    public Boolean getStatus() {
        return this.status;
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
