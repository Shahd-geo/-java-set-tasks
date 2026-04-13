import java.util.HashSet;
import java.util.Set;

public class TASK8 {
    static void main(String[] args) {
        Set<String>studentName=new HashSet<>();
        studentName.add("Shahd");
        studentName.add("Qabas");
        studentName.add("Sara");
        studentName.add("iAl");
        studentName.add("Ahmad");
        System.out.println(studentName);
        studentName.add("Sara");
        System.out.println(studentName.contains("iAl"));
        studentName.remove("Qabas");
        System.out.println(studentName);
        System.out.println(studentName.size());
        studentName.clear();
        System.out.println(studentName);
        System.out.println(studentName.size());



    }
}
