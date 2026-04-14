import java.util.HashSet;
import java.util.Set;

public class TASK9 {
    static void main(String[] args) {
        Set<String>CitySetDemo=new HashSet<>();
        CitySetDemo.add("Muscat");
        CitySetDemo.add("Nizwa");
        CitySetDemo.add("Salalah");
        CitySetDemo.add("Barka");
        CitySetDemo.add("Ibri");
        System.out.println(CitySetDemo);
        CitySetDemo.add("Muscat");
        System.out.println(CitySetDemo);
        System.out.println(CitySetDemo.contains("Nizwa"));
        CitySetDemo.remove("Barka");
        System.out.println(CitySetDemo);
        System.out.println(CitySetDemo.size());
        CitySetDemo.clear();
        System.out.println(CitySetDemo);
        System.out.println(CitySetDemo.size());





    }
}
