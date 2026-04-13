import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    static void main(String[] args) {
        Set<String>products =new HashSet<>();
        products.add("P1001");
        products.add("P1002");
        products.add("P1003");
        products.add("P1004");
        products.add("P1005");
        System.out.println("PRODUCTS CODES:" +products);
        products.add("P10016");
        System.out.println("Aftter adding new products :"+products);

    }

}
