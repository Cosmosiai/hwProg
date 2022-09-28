package hw4.n11.Liability;

public class Professional  extends Liability{

    public Professional(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    @Override
    protected void extension() {
        super.extension();
    }

    @Override
    protected void termination() {
        super.termination();
    }

    @Override
    protected void execution() {
        super.execution();
    }
}
