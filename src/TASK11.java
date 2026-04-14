import java.util.HashSet;
import java.util.Set;

public class TASK11 {
    static void main(String[] args) {
        Set<String> BookSetDemo=new HashSet<>();
        BookSetDemo.add("asdsfg");
        BookSetDemo.add("mnbvcc");
        BookSetDemo.add("qwerhgj");
        BookSetDemo.add("zxcdsa");
        BookSetDemo.add("vbgfdt");
        System.out.println(BookSetDemo);
        BookSetDemo.add("asdsfg");
        System.out.println(BookSetDemo);

        BookSetDemo.remove( "vbgfdt " );
        System.out.println(BookSetDemo);
        System.out.println(BookSetDemo.size());
        BookSetDemo.clear();
        System.out.println(BookSetDemo);
        System.out.println(BookSetDemo.size());






    }
}
