import java.util.HashSet;
import java.util.Set;

public class TASK13 {
    static void main(String[] args) {
        Set<String>MovieSetDemo=new HashSet<>();
        MovieSetDemo.add("Qwe123");
        MovieSetDemo.add("GHTY7");
        MovieSetDemo.add("NJMU89");
        MovieSetDemo.add("BGHY90");
        MovieSetDemo.add("XZSD890");
        System.out.println(MovieSetDemo);
        MovieSetDemo.add("XZSD890");
        System.out.println(MovieSetDemo);
        System.out.println(MovieSetDemo.contains("XZSD890"));
        MovieSetDemo.remove("XZSD890");
        System.out.println(MovieSetDemo);
        System.out.println(MovieSetDemo.size());
        MovieSetDemo.clear();
        System.out.println(MovieSetDemo.size());



    }
}
