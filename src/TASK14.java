import java.util.HashSet;
import java.util.Set;

public class TASK14 {
    static void main(String[] args) {
        Set<String>WebsiteSetDemo=new HashSet<>();
        WebsiteSetDemo.add("PWE123");
        WebsiteSetDemo.add("QST123");
        WebsiteSetDemo.add("NMLK99");
        WebsiteSetDemo.add("NMHYI0");
        WebsiteSetDemo.add("VFTY23");
        System.out.println(WebsiteSetDemo);
        WebsiteSetDemo.add("NMLK99");
        System.out.println(WebsiteSetDemo);
        System.out.println(WebsiteSetDemo.contains("NMLK99"));
        System.out.println(WebsiteSetDemo.size());
        WebsiteSetDemo.clear();
        System.out.println(WebsiteSetDemo);
        System.out.println(WebsiteSetDemo.size());



    }
}
