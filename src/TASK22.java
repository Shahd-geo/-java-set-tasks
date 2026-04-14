import java.util.HashSet;
import java.util.Set;

public class TASK22 {
    static void main(String[] args) {
        Set<String>CountrySetDemo=new HashSet<>();
        CountrySetDemo.add("OMAN");
        CountrySetDemo.add("QATAR");
        CountrySetDemo.add("UK");
        CountrySetDemo.add("US");
        CountrySetDemo.add("UAE");
        System.out.println(CountrySetDemo);
        CountrySetDemo.add("BAHRAIN");
        System.out.println(CountrySetDemo);
        System.out.println(CountrySetDemo.contains("OMAN"));
        CountrySetDemo.remove("OMAN");
        System.out.println(CountrySetDemo);
        System.out.println(CountrySetDemo.size());
        CountrySetDemo.clear();
        System.out.println(CountrySetDemo);
        System.out.println(CountrySetDemo.size());



    }
}
