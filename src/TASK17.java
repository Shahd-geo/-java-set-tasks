import java.util.HashSet;
import java.util.Set;

public class TASK17 {
    static void main(String[] args) {
        Set<String> CourseSetDemo17 = new HashSet<>();
        CourseSetDemo17.add("Math");
        CourseSetDemo17.add("English");
        CourseSetDemo17.add("Arabic");
        CourseSetDemo17.add("Art");
        CourseSetDemo17.add("Science");
        System.out.println(CourseSetDemo17);
        CourseSetDemo17.add("Art");
        System.out.println(CourseSetDemo17);
        System.out.println(CourseSetDemo17.contains("Math"));
        CourseSetDemo17.remove("Art");
        System.out.println(CourseSetDemo17);
        System.out.println(CourseSetDemo17.size());
        CourseSetDemo17.clear();
        System.out.println(CourseSetDemo17);
        System.out.println(CourseSetDemo17.size());

    }
}

