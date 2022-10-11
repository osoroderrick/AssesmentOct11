import assesmentOct11.*;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Create an instance of the Admin class
        Admin admin = new Admin("Peter", "adminPassword");

        //Create 3 customer objects
        Product[] products = {new Battery("AA Battery", 5.0, Size.M), new IceCream("CookiesNCream", 8.0, Size.L), new PostalStamp("Team-USA",20.0,Size.S,3)};

        ArrayList<String> addresses = new ArrayList<>();
        addresses.add("111 First st.,Newark,DE,19702");
        addresses.add("12 Real News Lane, Dover, DE 19901");
        addresses.add("333 Third st.,Newark,DE,19702");

        Customer customer1 = new Customer("c1", "customer1Password", 32, 100, addresses,Size.L,products);
        Customer customer2 = new Customer("c2", "customer2Password", 0, 500, addresses,Size.NULL,products);
        Customer customer3 = new Customer("c3", "customer3Password", 0, 250, addresses,Size.NULL,products);

        //Set customer1's accountBalance to negative number
        customer1.setAccountBalance(- 150.0);
        System.out.println("===Get and print out customer1's balance====");
        System.out.println(customer1.getAccountBalance());

        //Call a method to give or award customer1 1000 reward points
        customer1.setRewardPoints(1000);

        //Invoke the method to make customer1 use 100 out of his/her 1000 reward points
        System.out.println("===useRewardPoints===");
        customer1.useRewardPoints(100);

        //Call a method to get/retrieve ONLY the secondary address of customer1 and then print it out
        System.out.println("===getSecondaryAddressOfCustomer of customer1===");
        System.out.println(App.getSecondaryAddressOfCustomer(customer1));

        //Set customer1's size to a Medium
        customer1.setSize(Size.M);

        //Invoke the print() method on the customer1 object
        System.out.println("===Print customer1's info with the print() method===");
        customer1.print();

        //Consume all the products that are considered consumable
        Consumable [] consumables = {new Battery("AA Battery", 5.0, Size.M),new IceCream("Vanilla ice-cream", 8.0, Size.L)};
        System.out.println("===Consume all consumable according to the UML===");
        App.consumeConsumables(consumables);

        //Set the amount of stamps to 3
        PostalStamp postalStamp = new PostalStamp("Team-USA",20.0,Size.S,3);

        //Print all printable objects by leveraging one of your method methods.
        System.out.println("===Print all printable objects===");
        IPrint [] iPrints = {postalStamp,customer1,customer2,customer3,admin};
        App.printAllPrintableObjects(iPrints);

        //Get and print out the Total Price Of customer1's Products
        System.out.println("==============================");
        System.out.println("===getTotalPriceOfCustomerProducts===");
        App.getTotalPriceOfCustomerProducts(customer1);

        //Get and print out the Total Price Of customer1's Products
        ArrayList<Product> products1 = new ArrayList<>();
        products1.add(new Battery("AA Battery", 5.0, Size.M));
        products1.add(new IceCream("CookiesNCream", 8.0, Size.L));
        products1.add(new PostalStamp("Team-USA",20.0,Size.S,3));

        System.out.println("===reverseSortAndPrintAllProductsByPrice===");
        App.reverseSortAndPrintAllProductsByPrice(products1);

        //Get and print out the List Of Product Prices Greater Than The Price Of Product Given
        System.out.println("===getListOfProductsGreaterThanThePriceOfProductGiven===");
        Battery battery = new Battery("AA Battery", 5.0, Size.M);
        System.out.println(App.getListOfProductPricesGreaterThanThePriceOfProductGiven(products1,battery));

        //Invoke the static method named addASingleProductToDirectoryTiedToCustomerByNameThenPrint on customer1.
        System.out.println("===addASingleProductToDirectoryTiedToCustomerByNameThenPrint===");
        Map<String,Product> directory = new HashMap<>();
        App.addASingleProductToDirectoryTiedToCustomerByNameThenPrint(directory,customer1,battery);
        App.addASingleProductToDirectoryTiedToCustomerByNameThenPrint(directory,customer2,battery);
        App.addASingleProductToDirectoryTiedToCustomerByNameThenPrint(directory,customer3,battery);

        //have the admin reset customer1's password to ReadyForBlock2
        customer1.setPassword("ReadyForBlock2");
        System.out.println(customer1.getPassword());







    }
}
