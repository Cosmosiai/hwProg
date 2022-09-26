package hw1.oop;

import java.util.Random;

public class Excursion extends Relax{
    static Random r=new Random();
    public Excursion(double commission, int days, boolean food, String transport) {
        super("excursion", commission, days, food, transport);
    }

    public static Excursion random(){
        double commission = r.nextDouble(25)+5;
        int days = r.nextInt(3)+1;
        String[] trans = {"Metro","U-Bahn", "S-Bahn","Metrotram","Auto","Bus","taxi","Zug"};
        String trasport = trans[r.nextInt(trans.length)];
        boolean food = r.nextBoolean();
        return new Excursion(commission,days,food,trasport);
    }
}
