package hw4.n16;

public class Petal implements Nature {
    private String color;
    private String type;

    public Petal(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public void growing() {
        System.out.println("период роста");
    }
}
