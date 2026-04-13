import java.util.HashSet;
import java.util.Set;

public class TASK6 {
    static void main(String[] args) {
        Set<String> userName=new HashSet<>();
        userName.add("abcd");
        userName.add("yoid");
        userName.add("cdnm");
        userName.add("vbcd");
        userName.add("mvbg");
        System.out.println(userName);
        System.out.println(userName.size());
        userName.clear();
        System.out.println(userName);
        System.out.println(userName.size());

    }
}
