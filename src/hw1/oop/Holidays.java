package hw1.oop;

import java.util.Random;

public class Holidays extends Relax{
    static Random r = new Random();
    public Holidays(double commission, int days, boolean food, String transport) {
        super("holidays", commission, days, food, transport);
    }

    public static Holidays random() {
        double commission = r.nextDouble(120)+30;
        int days = r.nextInt(30)+1;
        String[] trans = {"Metro","U-Bahn", "S-Bahn","Metrotram","Auto","Bus","taxi","Flugzeug","Zug"};
        String transport = trans[r.nextInt(trans.length)];
        boolean food =r.nextBoolean();
        return new Holidays(commission,days,food,transport);
    }
}
