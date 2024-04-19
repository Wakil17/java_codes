package light;

public class Main {
    public static void main(String[]args){
        Lamp lamp1 = new Lamp(true);
        Lamp lamp2 = new Lamp(9);
        Switch mySwitch = new Switch(lamp1, lamp2);

        mySwitch.switchOnLamp1();
        lamp1.display();
        mySwitch.switchOnLamp2(8);
        lamp2.display();
        mySwitch.switchOff();
        lamp1.display();
        lamp2.display();


    }
}
