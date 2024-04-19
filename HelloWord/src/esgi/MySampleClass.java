package esgi;

public class MySampleClass {
    public static final double PI = 3.14;
    public Integer myNumber; //null
    private boolean isOk; //false

    public MySampleClass(int anIntNumbber) {
      this.myNumber = new Integer(anIntNumbber);
        //this.myNumber = anIntNumbber;
    }

    public boolean isOk() { //méthode setter
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

}
