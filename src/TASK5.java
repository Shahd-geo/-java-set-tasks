import java.util.HashSet;
import java.util.Set;

public class TASK5 {
    static void main(String[] args) {
        Set<String>  departments = new HashSet<>();
        departments.add("Geography");
        departments.add("Tourism");
        departments.add("English");
        departments.add("Education");
        departments.add("Arabic");
        System.out.println(departments);
        System.out.println(departments.size());
        departments.add("sport");
        System.out.println(departments.size());
    }
}
