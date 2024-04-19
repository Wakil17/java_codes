package esgi;

public class go {

    public static void main(String[] args){

    MySampleClass sample1 = new MySampleClass(4);
    MySampleClass sample2 = new MySampleClass(0);
    MySampleClass sample3 = new MySampleClass(-123);
    System.out.println("coucou" + sample1.myNumber);
    System.out.println("sample1 isOk(): " + sample1.isOk());
    }
}
