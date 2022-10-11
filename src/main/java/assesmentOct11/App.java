package assesmentOct11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class App {

    public static void printAllPrintableObjects(IPrint [] iPrints){
        for(IPrint iPrint: iPrints){
            System.out.println("==============================");
            System.out.println(iPrint);

        }

    }
    public static void consumeConsumables(Consumable [] consumables){
        for(Consumable consumable : consumables){
            consumable.consume();

        }
    }
    public static void getTotalPriceOfCustomerProducts(Customer customer){
        double totalPrice = 0;
        for(Product product: customer.getProducts()){
            totalPrice +=  product.getPrice();
        }
        System.out.println(totalPrice);

    }
    public static String getSecondaryAddressOfCustomer(Customer customer){
        String secondaryAddress = "";
        for(int i = 0; i < customer.getAddresses().size(); i++){
            if (i == 1){
                 secondaryAddress = customer.getAddresses().get(i);
            }
        }
        return secondaryAddress;
    }
    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if(product1.getPrice() > product2.getPrice()) {
                    return 1;
                } else{
                    return 0;
                    }
            }
        };
        Collections.sort(products, comparator);
        for(Product product : products){
            System.out.println(product.getPrice());
        }
    }
    public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> productArrayList, Product product){
       ArrayList<Double> pricesGreaterThan = new ArrayList<>();
        for(Product currentProduct: productArrayList){
           if(currentProduct.getPrice() > product.getPrice()){
               pricesGreaterThan.add(currentProduct.getPrice());
           }
       }
        return pricesGreaterThan;
    }
    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String,Product> directory, Customer customer,Product product){
        directory.clear();
        directory.put(customer.getUsername(),product);
        System.out.println(directory.keySet()+ " : " + directory.values());
    }
}
