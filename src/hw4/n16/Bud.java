package hw4.n16;

public class Bud implements Nature{
    private int petalInt;
    private Petal petal;

    public Bud(int petalInt, Petal petal) {
        this.petalInt = petalInt;
        this.petal = petal;
    }

    public int getPetalInt() {
        return petalInt;
    }

    public Petal getPetal() {
        return petal;
    }

    @Override
    public void growing() {
        System.out.println("период роста");
    }
}
