package velos;

public class Launcher {
    public static void main (String[] args){

        String firstvelo = "Vélo 1";
        Bike myBike1 = new Bike(firstvelo);
        myBike1.WheelCount = 4;
        myBike1.display(myBike1);
    }
}
