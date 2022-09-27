package hw4.n11.Personal;

import hw4.n11.Insurance;

public abstract class Personal extends Insurance {
    public Personal(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    @Override
    protected void extension() {

    }

    @Override
    protected void termination() {

    }

    @Override
    protected void execution() {

    }
}
