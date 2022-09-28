import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    static List<String > list = new ArrayList<>();

    public static void main(String[] args) {
        /*list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");*/
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach((String s) -> System.out.println(s));
        list.forEach(System.out::print);
    }
}
