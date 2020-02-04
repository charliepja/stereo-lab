package components;

public class CDPlayer extends Component implements IPlay  {
        private String make;
        private String model;
        private String CD;
        private int trackNumber;
        private Boolean status;

        public CDPlayer(String make, String model) {
            this.make = make;
            this.model = model;
            this.trackNumber = 1;
            this.status = false;
        }

        public String getMake() {
            return this.make;
        }

        public String getModel() {
            return this.model;
        }

        public String getCD() {
            return this.CD;
        }

        public Boolean getStatus() {
            return this.status;
        }

        public void setCD(String CD) {
            this.CD = CD;
        }

        public String play() {
            return this.CD + " is currently playing track " + this.trackNumber;
        }

        public String pause() {
            return this.CD + " has been paused!";
        }

        public String stop() {
            return this.CD + " has now stopped!";
        }

        public void skipTrack(){
            this.trackNumber += 1;
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



