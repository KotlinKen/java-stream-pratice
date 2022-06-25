import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "corn"));

        //soutc -> system.out::println
        stringList.stream().filter("corn super"::contains).forEach(System.out::println);

        stringList.stream().filter(fruit -> fruit.contains("ba")).forEach(System.out::println);

        stringList.stream().filter("banana"::equals).forEach(System.out::println);


        /**
         * Double colon
         * can use inside lambda expressions
         * [instance]::Method or [instance]::new
         * examples, System.out::println
         */
    }
}
