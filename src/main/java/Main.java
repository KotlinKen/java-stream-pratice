import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "corn"));

        //soutc -> system.out::println
        stringList.stream().filter("b"::contains).forEach(System.out::println);

    }
}
