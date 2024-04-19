package multiconst;

public class Go {
    public static void main(String[] args){

        Point point1 = new Point();
        Point point2 = new Point(5);
        Point point3 = new Point(5, 8);
        Point point4 = new Point(5, 8, 9);

        System.out.println("point 1 : " + point1.toString());
        System.out.println("point 2 : " + point2.toString());
        System.out.println("point 3 : " + point3.toString());
        System.out.println("point 4 : " + point4.toString());


    }
}
