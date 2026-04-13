import java.util.HashSet;
import java.util.Set;

public class Task3SetDemo {
    static void main(String[] args) {
      Set<Integer>CheckSetDemo=new HashSet<>();
      CheckSetDemo.add(12345);
        CheckSetDemo.add(12389);
        CheckSetDemo.add(26745);
        CheckSetDemo.add(98765);
        CheckSetDemo.add(809876);
        System.out.println(CheckSetDemo);
        System.out.println(CheckSetDemo.contains(12389));
        System.out.println(CheckSetDemo.contains(00000));



    }
}
