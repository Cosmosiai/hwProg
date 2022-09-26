package hw4.n16;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(new Bud(8,new Petal("red","star")));
//        Flower.heyday();
//        Flower.withering();
        flower.getColor();
    }
}
