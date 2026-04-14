import java.util.HashSet;
import java.util.Set;

public class TASK19 {
    static void main(String[] args) {
        Set<String> EmployeeSetDemo =new HashSet<>();
        EmployeeSetDemo .add("shahd");
        EmployeeSetDemo .add("Ali");
        EmployeeSetDemo .add("Ahmad");
        EmployeeSetDemo .add("sara");
        EmployeeSetDemo .add("Tom");
        System.out.println(EmployeeSetDemo );
        EmployeeSetDemo .add("Tom");
        System.out.println(EmployeeSetDemo );
        System.out.println(EmployeeSetDemo .contains("Tom"));
        EmployeeSetDemo .remove("Tom");
        System.out.println(EmployeeSetDemo );
        System.out.println(EmployeeSetDemo .size());
        EmployeeSetDemo .clear();
        System.out.println(EmployeeSetDemo );
        System.out.println(EmployeeSetDemo .size());
    }
}
