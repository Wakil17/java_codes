package week;

public class Lancher {
    public static void main(String[]args){
        //DayPair<Integer, Day> jour1 = new DayPair<>(1, Day.LUNDI);
        //DayPair<Integer, Day> jour2 = new DayPair<>(1, Day.MARDI);
        //DayPair<Integer, Day> jour3 = new DayPair<>(1, Day.MERCREDI);

        DataPair[] days = new DataPair[7];
        for (int i = 0; i < Day.values().length; i++){
            days[i] = new DataPair<>(i+1, Day.values()[i]);
        }

        displayWithNums(days,  1,2,3);

    }
        static void displayWithNums(DataPair[] days, int... nums){
            for (int i = 0; i < nums.length; i++) {
              int dayNum = nums[i];

              if(dayNum > 0 && dayNum < days.length){
                System.out.println("Jour" + days[dayNum].getKey() + " = " + days[dayNum].getValue());
            }
        }
    }
}
