package assesmentOct11;

public class PostalStamp extends Product implements IPrint{
    private int amount;

    public PostalStamp(String name, double price, Size size, int amount) {
        super(name, price, size);
        this.amount = amount;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "PostalStamp" + this.getName() +
                "\namount= " + amount;
    }
}
