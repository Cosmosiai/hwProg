package hw4.n11.Property;

import hw4.n11.Insurance;

public abstract class Property extends Insurance {
    public Property(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    @Override
    protected void conclusion() {

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
