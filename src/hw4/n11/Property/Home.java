package hw4.n11.Property;

public class Home extends Property{

    public Home(String companyName, String name, int month, double cashProMonth, String datum) {
        super(companyName, name, month, cashProMonth, datum);
    }

    public Home() {
    }


    @Override
    public void extension() {

    }

    @Override
    public void extension(int month) {
        this.month=this.month+month;
    }

    @Override
    public void termination() {
        System.out.println("ваша страховка аннулирована");
    }

    @Override
    public void execution() {
        System.out.println("к вам идут наши специалисты");
    }
}
