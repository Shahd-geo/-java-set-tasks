import java.util.HashSet;
import java.util.Set;

public class TASK21 {
    static void main(String[] args) {
        Set<String>CarSetDemo=new HashSet<>();
        CarSetDemo.add("Camery");
        CarSetDemo.add("Mursades");
        CarSetDemo.add("Tesla");
        CarSetDemo.add("porsh");
        CarSetDemo.add("BM");
        System.out.println(CarSetDemo);
        CarSetDemo.add("Camery");
        System.out.println(CarSetDemo);
        System.out.println(CarSetDemo.contains("Tesla"));
        CarSetDemo.remove("Tesla");
        System.out.println(CarSetDemo);
        System.out.println(CarSetDemo.size());
        CarSetDemo.clear();
        System.out.println(CarSetDemo);
        System.out.println(CarSetDemo.size());

    }
}

