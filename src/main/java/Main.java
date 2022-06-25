import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "corn"));

        //soutc -> system.out::println
        stringList.stream().filter("ba"::contains).forEach(System.out::println);
        //not working

        stringList.stream().filter(fruit -> fruit.contains("ba")).forEach(System.out::println);
        //working

        stringList.stream().filter("banana"::equals).forEach(System.out::println);

    }
}
