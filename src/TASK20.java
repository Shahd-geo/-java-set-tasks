import java.util.HashSet;
import java.util.Set;

public class TASK20 {
    static void main(String[] args) {
        Set<String> SubjectSetDemo = new HashSet<>();
        SubjectSetDemo.add("Math");
        SubjectSetDemo.add("English");
        SubjectSetDemo.add("Arabic");
        SubjectSetDemo.add("Art");
        SubjectSetDemo.add("Science");
        System.out.println(SubjectSetDemo);
        SubjectSetDemo.add("Art");
        System.out.println(SubjectSetDemo);
        System.out.println(SubjectSetDemo.contains("Math"));
        SubjectSetDemo.remove("Art");
        System.out.println(SubjectSetDemo);
        System.out.println(SubjectSetDemo.size());
        SubjectSetDemo.clear();
        System.out.println(SubjectSetDemo);
        System.out.println(SubjectSetDemo.size());

    }
}

