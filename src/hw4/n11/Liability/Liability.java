package hw4.n11.Liability;

import hw4.n11.Insurance;

public abstract class Liability extends Insurance {
    public Liability(String companyName, String name, int month, double cashProMonth, String datum) {
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
