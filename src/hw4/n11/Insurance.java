package hw4.n11;

public abstract class Insurance {
    public String companyName;
    private String name;
    private int month;
    private double cashProMonth;
    private String datum;

    public Insurance(String companyName, String name, int month, double cashProMonth, String datum) {
        this.companyName = companyName;
        this.name = name;
        this.month = month;
        this.cashProMonth = cashProMonth;
        this.datum = datum;
    }

    protected abstract void extension();
    protected abstract void termination();
    protected abstract void execution();
}
