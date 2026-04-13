import java.util.HashSet;
import java.util.Set;
public class Task2SetDemo {
    static void main(String[] args) {
        Set<Integer> CustomerSetDemo = new HashSet<>();
        CustomerSetDemo.add(1234579);
        CustomerSetDemo.add(1889763);
        CustomerSetDemo.add(1589073);
        CustomerSetDemo.add(1889064);
        CustomerSetDemo.add(1967239);
        System.out.println("Set before dublicate:"+CustomerSetDemo);
        CustomerSetDemo.add(1234579);
        System.out.println("Set after dublicate:" +CustomerSetDemo);
    }
}
