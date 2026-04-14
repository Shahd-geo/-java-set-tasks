import java.util.HashSet;
import java.util.Set;

public class TASK23 {
    static void main(String[] args) {
       Set<String> AnimalSetDemo=new HashSet<>();
       AnimalSetDemo.add("cat");
        AnimalSetDemo.add("dog");
        AnimalSetDemo.add("tiger");
        AnimalSetDemo.add("monkey");
        AnimalSetDemo.add("lion");
        System.out.println(AnimalSetDemo);
        AnimalSetDemo.add("DONKEY");
        System.out.println(AnimalSetDemo);
        System.out.println(AnimalSetDemo.contains("tiger"));
        AnimalSetDemo.remove("tiger");
        System.out.println(AnimalSetDemo.size());
        AnimalSetDemo.clear();
        System.out.println(AnimalSetDemo);
        System.out.println(AnimalSetDemo.size());










    }
}
