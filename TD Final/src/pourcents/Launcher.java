package pourcents;

public class Launcher {
    public void updateInt(int ent){
        ent = 2;
    }

    public int updateAndReturn(int ent){
        ent = 2;
        return ent;
    }

    public void updatePercent(Percent pourcent){
        pourcent.setEntier(4);
    }

 public void updateIntFinal(final Percent obj){
       obj.setEntier(4);
    }

    public static void main(String [] args){

    }


}
