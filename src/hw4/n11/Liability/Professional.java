package hw4.n11.Liability;

import java.util.Scanner;

public class Professional  extends Liability{
    static Scanner sc = new Scanner(System.in);
    String[] service = {"1 - минимум", "2 - норма", "3 - максимум", "4 - кастом(в разработке)"};
    double[] bill = {500,2000,5000};

    public Professional(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    public Professional() {
    }

    @Override
    public void extension(int month) {
         this.month = this.month + month;
        System.out.println("контракт продлён");
    }

    @Override
    public void termination() {
        super.termination();
    }

    @Override
    public void execution() {
        super.execution();
    }

    @Override
    public void howMuchPay() {
        System.out.println("сколько целых месяцев");
        int monate = sc.nextInt();
        System.out.println("Выберите тариф:");
        System.out.println(this.service.toString());
        int a = sc.nextInt();
        switch (a-1){
            case 0:
                System.out.println(this.bill[a-1]*monate);
                break;
            case 1:
                System.out.println(this.bill[a-1]*monate);
                break;
            case 2:
                System.out.println(this.bill[a-1]*monate);
                break;
            case 3:
                System.out.println(this.bill[a-1]*monate);
                break;
            default:
                System.out.println("вы ошиблись");
        }
    }
}