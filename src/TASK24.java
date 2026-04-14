import java.util.HashSet;
import java.util.Set;

public class TASK24 {
    static void main(String[] args) {
        Set<String>  FruitSetDemo  =new HashSet<>();
        FruitSetDemo  .add("apple");
        FruitSetDemo  .add("banana");
        FruitSetDemo  .add("greb");
        FruitSetDemo  .add("orange");
        FruitSetDemo  .add("mango");
        System.out.println( FruitSetDemo  );
        FruitSetDemo  .add("mangosten");
        System.out.println( FruitSetDemo  );
        System.out.println( FruitSetDemo  .contains("greb"));
        FruitSetDemo  .remove("greb");
        System.out.println( FruitSetDemo  .size());
        FruitSetDemo  .clear();
        System.out.println( FruitSetDemo  );
        System.out.println( FruitSetDemo .size());
    }
}
