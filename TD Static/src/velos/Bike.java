package velos;

public class Bike {
    public static int defaultWheelCount = 2;
    public int WheelCount;
    private String label;

    Bike(String labelInit){
        this.label = labelInit;
    }

    public static void display(Bike aBike){
        System.out.println("Label: " + aBike.label + "; Wheel Count: " + aBike.WheelCount + "; Default Wheel Count: " + Bike.defaultWheelCount);
    }

}