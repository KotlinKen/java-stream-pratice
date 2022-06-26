import model.Dog;
import model.Town;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Double colon
 * can use inside lambda expressions
 * [instance]::Method or [instance]::new
 * examples, System.out::println
 */

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "corn"));

        //soutc -> system.out::println
        stringList.stream().filter("corn super"::contains).forEach(System.out::println);
        stringList.stream().filter(fruit -> "corn super".contains(fruit)).forEach(System.out::println);

        stringList.stream().filter(fruit -> fruit.contains("ba")).forEach(System.out::println);

        stringList.stream().filter("banana"::equals).forEach(System.out::println);
        List<Dog> dogList = stringList.stream().map(Dog::new).collect(Collectors.toList());
        dogList.forEach(System.out::println);

        dogList.stream().map(Town::new).forEach(System.out::println);


        String[] array = new String[]{"a", "b", "c"};


        Stream<String> stream = Arrays.stream(array, 1, 3);
        stream.forEach(System.out::println);



    }
}
