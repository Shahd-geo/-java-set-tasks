import java.util.HashSet;
import java.util.Set;

public class TASK12 {
    static void main(String[] args) {
        Set<String>AppSetDemo=new HashSet<>();
        AppSetDemo.add("INST");
        AppSetDemo.add("SNAPCHAT");
        AppSetDemo.add("WECHAT");
        AppSetDemo.add("ALIPAY");
        AppSetDemo.add("LINKDIN");
        System.out.println(AppSetDemo);
        AppSetDemo.add("LINKDIN");
        System.out.println(AppSetDemo);
        System.out.println(AppSetDemo.contains("LINKDIN"));
        AppSetDemo.remove("LINKDIN");
        System.out.println(AppSetDemo);
        System.out.println(AppSetDemo.size());
        AppSetDemo.clear();
        System.out.println(AppSetDemo);
        System.out.println(AppSetDemo.size());








    }
}
