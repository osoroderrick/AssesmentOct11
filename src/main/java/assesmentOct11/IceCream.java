package assesmentOct11;

public class IceCream extends Product implements Consumable,LickAble{

    public IceCream(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {
        System.out.println("Now consuming " + this.getName());
    }

    @Override
    public boolean safeToLick() {
        return true;
    }
}
