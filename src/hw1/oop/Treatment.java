package hw1.oop;

import java.util.Random;

public class Treatment extends Relax{
    static Random r = new Random();
    public Treatment(double commission, int days, boolean food, String transport) {
        super("treatment", commission, days, food, transport);
    }

    public static Treatment random(){
        double commission = r.nextDouble(3)+3;
        int days = r.nextInt(20)+11;
        String[] trans = {"Metro","U-Bahn", "S-Bahn","Metrotram","Auto","Bus","taxi","Flugzeug","Zug"};
        String trasport = trans[r.nextInt(trans.length)];
        boolean food = r.nextBoolean();
        return new Treatment(commission,days,food,trasport);
    }
}
