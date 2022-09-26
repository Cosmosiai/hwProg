package hw1.oop;

import java.util.Random;

public class Shoping extends Relax{
    static Random r = new Random();
    public Shoping(double commission, int days, String transport) {
        super("shoping", commission, days, false, transport);
    }
    public static Shoping random(){
        double commission = r.nextDouble(3)+3;
        int days = r.nextInt(3)+1;
        String[] trans = {"Metro","U-Bahn", "S-Bahn","Metrotram","Auto","Bus","taxi","Flugzeug","Zug"};
        String trasport = trans[r.nextInt(trans.length)];
        return new Shoping(commission,days,trasport);
    }
}
