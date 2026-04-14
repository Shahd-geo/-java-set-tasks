import java.util.HashSet;
import java.util.Set;

public class TASK16 {
    static void main(String[] args) {
        Set<String> StudentSetDemo=new HashSet<>();
        StudentSetDemo.add("shahd");
        StudentSetDemo.add("Ali");
        StudentSetDemo.add("Ahmad");
        StudentSetDemo.add("sara");
        StudentSetDemo.add("Tom");
        System.out.println(StudentSetDemo);
        StudentSetDemo.add("Tom");
        System.out.println(StudentSetDemo);
        System.out.println(StudentSetDemo.contains("Tom"));
        StudentSetDemo.remove("Tom");
        System.out.println(StudentSetDemo);
        System.out.println(StudentSetDemo.size());
        StudentSetDemo.clear();
        System.out.println(StudentSetDemo);
        System.out.println(StudentSetDemo.size());






    }
}
