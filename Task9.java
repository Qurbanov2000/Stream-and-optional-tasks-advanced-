package StreamAdvanced;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MyProduct {
    String id;
    double price;
    double quantity;
    public MyProduct(String id, double price, double quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Task9 {
    public static void main(String[] args) {
        List<MyProduct> products = List.of(
          new MyProduct("meat",5,10),
          new MyProduct("milk",8.2, 5),
          new MyProduct("spagetti",3,6),
          new MyProduct("fish",15,2)
        );

        double sum = products.stream().mapToDouble(product -> product.price * product.quantity).sum();
        System.out.println(sum);
    }
}
