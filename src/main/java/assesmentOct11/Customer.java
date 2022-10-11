package assesmentOct11;

import java.util.ArrayList;
import java.util.Arrays;

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

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance > 0){
            this.accountBalance = accountBalance;
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void useRewardPoints(int rewardPointsToUse){
        int finalRewardPoints = this.rewardPoints - rewardPointsToUse;
        this.setRewardPoints(finalRewardPoints);
        System.out.println("You Just used "+ rewardPointsToUse + " points and now you have "+ finalRewardPoints + " points left");
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "username: " + this.getUsername() +
                "\nreward points: " + rewardPoints +
                "\naccountBalance: " + accountBalance +
                "\nsize: " + size;

    }
}
