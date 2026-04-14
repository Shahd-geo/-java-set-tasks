import java.util.HashSet;
import java.util.Set;

public class TASK10 {
    static void main(String[] args) {
        Set<String> CourseSetDemo = new HashSet<>();
        CourseSetDemo.add("Math");
        CourseSetDemo.add("English");
        CourseSetDemo.add("Arabic");
        CourseSetDemo.add("Art");
        CourseSetDemo.add("Science");
        System.out.println(CourseSetDemo);
        CourseSetDemo.add("Art");
        System.out.println(CourseSetDemo);
        System.out.println(CourseSetDemo.contains("Math"));
        CourseSetDemo.remove("Art");
        System.out.println(CourseSetDemo);
        System.out.println(CourseSetDemo.size());
        CourseSetDemo.clear();
        System.out.println(CourseSetDemo);
        System.out.println(CourseSetDemo.size());

    }
}
