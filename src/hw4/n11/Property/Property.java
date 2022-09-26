package hw4.n11.Property;

import hw4.n11.Insurance;

public interface Property extends Insurance {
    void conclusion(String name, double money, int month);

    void extension(int month);
}
