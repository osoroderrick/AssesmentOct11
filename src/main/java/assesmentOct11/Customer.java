package assesmentOct11;

import java.util.ArrayList;

public class Customer extends User{
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> addresses = new ArrayList<>();
    private Size size;
    private Product [] products;


    public Customer(String username, String password, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] products) {
        super(username, password);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }

    public void useRewardPoints(int rewardPoints){

    }

    @Override
    public void print() {

    }
}
