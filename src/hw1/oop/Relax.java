package hw1.oop;

public class Relax {
    private static int statId=0;
    private String type;
    private double commission;
    private int days;
    private boolean food;
    private String transport;
    private int id;

    public Relax(String type, double commission, int days, boolean food, String transport) {
        this.id=statId;
        this.type = type;
        this.commission = commission;
        this.days = days;
        this.food = food;
        this.transport = transport;
        statId++;
    }

    @Override
    public String toString() {
        return "Relax{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", commission=" + commission +
                ", days=" + days +
                ", food=" + food +
                ", transport='" + transport + '\'' +
                '}';
    }

    public static Relax random() {
        return null;
    }

    public String getType() {
        return type;
    }

    public double getCommission() {
        return commission;
    }

    public int getDays() {
        return days;
    }

    public boolean isFood() {
        return food;
    }

    public String getTransport() {
        return transport;
    }

    public int getId() {
        return id;
    }
}
