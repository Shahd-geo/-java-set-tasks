import java.util.HashSet;
import java.util.Set;

public class TASK4 {
    static void main(String[] args) {
        Set<String>RemoveSetDemo=new HashSet<>();
        RemoveSetDemo.add("ipad34");
        RemoveSetDemo.add("ipad89");
        RemoveSetDemo.add("ipad678");
        RemoveSetDemo.add("ipad098");
        RemoveSetDemo.add("ipad654");
        System.out.println(RemoveSetDemo);
        RemoveSetDemo.remove("ipad89");
        System.out.println(RemoveSetDemo);
    }
}
