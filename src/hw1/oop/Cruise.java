package hw1.oop;

import java.util.Random;

public class Cruise extends Relax{

    static Random r = new Random();
    public Cruise(double commission, int days) {
        super("cruise", commission, days, true, "Schiff");
    }
    public static Cruise random(){
        double commission = r.nextDouble(3)+3;
        int days = r.nextInt(3)+1;
        return new Cruise(commission,days);
    }
}
