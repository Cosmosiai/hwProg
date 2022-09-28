package hw4.n11.Property;

import hw4.n11.Insurance;

public abstract class Property implements Insurance {
    public String companyName;
    public String name;
    public int month;
    private double cashProMonth;
    private String datum;

    public Property(String companyName, String name, int month, double cashProMonth, String datum) {
        this.companyName = companyName;
        this.name = name;
        this.month = month;
        this.cashProMonth = cashProMonth;
        this.datum = datum;
    }

    public Property() {
    }

    @Override
    public void extension(int month) {
        System.out.println("контракт продлён на "+ month+ " месяцев");
    }

    @Override
    public void termination() {
        System.out.println("контракт расторгнут");
    }

    @Override
    public void execution() {

    }

    @Override
    public void howMuchPay() {

    }
}
