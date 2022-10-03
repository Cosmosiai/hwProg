package hw4.n11.Liability;

import hw4.n11.Insurance;

public abstract class Liability implements Insurance {
    public String companyName;
    public String name;
    public int month;
    private double cashProMonth;
    private String datum;

    public Liability(String companyName, String name, int month, double cashProMonth, String datum) {
        this.companyName = companyName;
        this.name = name;
        this.month = month;
        this.cashProMonth = cashProMonth;
        this.datum = datum;
    }

    public Liability() {
    }


    @Override
    public void extension() {
        this.month = this.month + month;
        System.out.println("контракт продлён");
    }

    @Override
    public void termination() {
        this.month = 0;
        System.out.println("контракт расторгнут");
    }

    @Override
    public void execution() {
        System.out.println("к вам едут наши специалисты");
    }


    public static void howMuchPay() {

    }
}
