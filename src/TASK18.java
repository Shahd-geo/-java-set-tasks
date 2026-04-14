import java.util.HashSet;
import java.util.Set;

public class TASK18 {
    static void main(String[] args) {
        Set<String> CitySetDemo18=new HashSet<>();
        CitySetDemo18.add("Muscat");
        CitySetDemo18.add("Nizwa");
        CitySetDemo18.add("Salalah");
        CitySetDemo18.add("Barka");
        CitySetDemo18.add("Ibri");
        System.out.println(CitySetDemo18);
        CitySetDemo18.add("Muscat");
        System.out.println(CitySetDemo18);
        System.out.println(CitySetDemo18.contains("Nizwa"));
        CitySetDemo18.remove("Barka");
        System.out.println(CitySetDemo18);
        System.out.println(CitySetDemo18.size());
        CitySetDemo18.clear();
        System.out.println(CitySetDemo18);
        System.out.println(CitySetDemo18.size());
    }
}
