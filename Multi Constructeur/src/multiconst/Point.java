package multiconst;

public class Point {

    public int x; // = 0
    public int y; // = 0
    public int z; // = 0

    public Point(){
        x = 0;
        y = 0;
        z = 0;
    }

    public Point(int a){
        x = a;
        y = a;
        z = a;
    }
    public Point(int a, int b){
        x = a;
        y = b;
        z = 0;
    }
    public Point(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    @Override
    public String toString() {
        return "x =" + "; y = " + y + "; z = " + z;
    }
}
