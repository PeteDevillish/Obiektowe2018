package egz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


//@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private String id; //unikalny ID w roju
    String productName;
    String customer;
    int quantity;

    public Order(String productName, String customer, int quantity) {
        this.productName = productName;
        this.customer = customer;
        this.quantity = quantity;
        id = UUID.randomUUID().toString().substring(0,8);

    }


}
