package packaje;

import java.util.Random;

public class Dice {
    public static final int MAX = 6;

    Random toto = new Random();
    public int roll(){
        return toto.nextInt(MAX);
    }
}
