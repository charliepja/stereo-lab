package components;

public class CDPlayer extends Component implements IPlay  {
        private String make;
        private String model;
        private String CD;
        private int trackNumber;

        public CDPlayer(String make, String model) {
            this.make = make;
            this.model = model;
            this.trackNumber = 1;
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
            return "This is on";
        }
        public String off(){
            return "This is off";
        }
}



