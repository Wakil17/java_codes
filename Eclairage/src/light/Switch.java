package light;

import static light.Lamp.LEVEL_MAX;
import static light.Lamp.LEVEL_MIN;

public class Switch {

    public Lamp lamp1;
    public Lamp lamp2;

    public Switch(Lamp LampOne, Lamp LampTwo) {
        lamp1 = LampOne;
        lamp2 = LampTwo;
    }

    public void switchOnLamp1() {
        lamp1.switchOn();
    }

        public void switchOnLamp2(int brightness){

        lamp2.switchOn(brightness);

        }

        public void switchOff() {
            lamp1.switchOff();
            lamp2.switchOff();

        }

    }

