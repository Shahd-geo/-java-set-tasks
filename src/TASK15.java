import java.util.HashSet;
import java.util.Set;

public class TASK15 {
    static void main(String[] args) {
        Set<String> ProductSetDemo=new HashSet<>();
        ProductSetDemo.add("Mobile");
        ProductSetDemo.add("Watch");
        ProductSetDemo.add("Labtop");
        ProductSetDemo.add("Ipad");
        ProductSetDemo.add("keyboard");
        System.out.println(ProductSetDemo);
        ProductSetDemo.add("keyboard");
        System.out.println(ProductSetDemo);
        System.out.println(ProductSetDemo.contains("Ipad"));
        ProductSetDemo.remove("Ipad");
        System.out.println(ProductSetDemo);
        System.out.println(ProductSetDemo.size());
        ProductSetDemo.clear();
        System.out.println(ProductSetDemo);
        System.out.println(ProductSetDemo.size());





    }
}
