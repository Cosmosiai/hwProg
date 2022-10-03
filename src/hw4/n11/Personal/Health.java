package hw4.n11.Personal;

public class Health extends Personal{

    public Health(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    @Override
    public void extension() {
        super.extension();
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
        this.month = this.month + month;
        System.out.println("контракт продлён");
    }
}
