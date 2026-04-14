import java.util.HashSet;
import java.util.Set;

public class TASK25 {
    static void main(String[] args) {
        Set<String> FlowerSetDemo   =new HashSet<>();
        FlowerSetDemo   .add("rose");
        FlowerSetDemo   .add("joori");
        FlowerSetDemo   .add("jasmine  ");
        FlowerSetDemo   .add("tuoip");
        FlowerSetDemo   .add(" Lily");
        System.out.println( FlowerSetDemo   );
        FlowerSetDemo   .add(" Sunflower");
        System.out.println( FlowerSetDemo   );
        System.out.println( FlowerSetDemo   .contains(" Sunflower"));
        FlowerSetDemo   .remove(" Sunflower");
        System.out.println( FlowerSetDemo  .size());
        FlowerSetDemo   .clear();
        System.out.println( FlowerSetDemo  );
        System.out.println( FlowerSetDemo  .size());
    }
}


