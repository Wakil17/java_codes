package light;

public class Lamp {
   //Constants
    public static final int LEVEL_MIN = 0;
    public static final int LEVEL_MAX = 5;

    //Attributes
    private boolean isOn;
    private int level;

    // Constructors
    Lamp(boolean on){
        isOn = on;

    /*    if(!isOn){
            level = LEVEL_MIN;
        }else{
            level = LEVEL_MAX;
        }
        */

        level =  (isOn) ? LEVEL_MAX : LEVEL_MIN;
    }



    public Lamp(int bright){
        if(bright >= LEVEL_MIN && bright < LEVEL_MAX){
            level = bright;
            isOn = (bright > LEVEL_MIN);
        }
    }

    public void switchOn(){
        isOn = true;
        level = LEVEL_MAX;
    }
    public void switchOn(int bright){
        if(bright >= LEVEL_MIN && bright <= LEVEL_MAX){
            level = bright;
            isOn = (bright > LEVEL_MIN);
        }
    }
    public void switchOff(){
        isOn = false;
        level = LEVEL_MIN;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public int getLevel() {
        return level;
    }

    public void display(){
        System.out.println("Lampe allumée ? " + isOn + " avec intensité " + level);
    }
}

