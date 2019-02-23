package egz;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

@Service
@Controller
public class Pyszne implements Vendor {

    List<String> products = new ArrayList<>(asList("Pizza", "Kebab", "Sushi", "Mexico food", "Burger", "Apple pie"));
    List<Order> orders = new ArrayList<>(asList(new Order("Pizza", "Pietro Pigazzi", 72),new Order("Mexico food", "El Flamengo", 88),new Order("Burger", "Johnny Revelator", 92)) );
   // List<String> products = new ArrayList<>();
    //List<Order> orders = new ArrayList<>();

    @Override
    public List<String> getProducts() {
        return products;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public Order orderProduct(String productName, String customer, int quantity) {


        productName = Compare.compareInList(productName, products);

        if(getProducts().contains(productName)) {
            Order order = new Order(productName, customer, quantity);
            orders.add(order);
            return order;
        }

//        else if(true){
//            productName = Compare.compareArray(productName, products);
//            if(productName != null){
//                Order order = new Order(productName, customer, quantity);
//                orders.add(order);
//                return order;
//            }
//

//        }
        else {
            System.out.println("Bardzo nam przykro, ale nie posiadamy jeszcze tego produktu w naszym asortymencie");
            System.out.println("Dostępne potrawy to " + getProducts());
            return null;

        }
            //orders.add(new Order(productName, customer, quantity));



    }

    //dodawanie produktow
    public String addProduct(String product) {
        products.add(product);
        return product;
    }

    //losowy produkt
    public String randomProduct() {
        int random = (int) (Math.random() * products.size());
        return products.get(random);
    }

    // zamówienie losowego produktu
        public Order orderRandomProduct(String customer, int quantity){
            return orderProduct(randomProduct(), customer, quantity);
        }


}
