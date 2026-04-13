import java.util.HashSet;
import java.util.Set;

public class TASK7 {
    static void main(String[] args) {
        Set<Integer> employeeIDs=new HashSet<>();
        employeeIDs.add(12345);
        employeeIDs.add(12389);
        employeeIDs.add(26745);
        employeeIDs.add(98765);
        employeeIDs.add(809876);
        System.out.println(employeeIDs);
        System.out.println(employeeIDs.contains(12389));
        employeeIDs.remove(98765);
        System.out.println(employeeIDs);
        System.out.println(employeeIDs.size());
        employeeIDs.clear();
        System.out.println(employeeIDs);
        System.out.println(employeeIDs.size());

    }
}
