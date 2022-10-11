package assesmentOct11;

public class PostalStamp extends Product implements IPrint{
    private int amount;

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    @Override
    public void print() {

    }
}
