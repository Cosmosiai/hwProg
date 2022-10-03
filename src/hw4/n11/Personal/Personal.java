package hw4.n11.Personal;

import hw4.n11.Insurance;

public abstract class Personal implements Insurance {
    public String companyName;
    public String name;
    public int month;
    private double cashProMonth;
    private String datum;

    public Personal(String companyName, String name, int month, double cashProMonth, String datum) {
        this.companyName = companyName;
        this.name = name;
        this.month = month;
        this.cashProMonth = cashProMonth;
        this.datum = datum;
    }

    public Personal() {
    }

    @Override
    public void extension() {

    }

    @Override
    public void termination() {

    }

    @Override
    public void execution() {

    }

    public static void howMuchPay() {

    }
}
