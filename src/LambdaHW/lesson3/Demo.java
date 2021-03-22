package LambdaHW.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        IntStream
                .range(1,10)
                .skip(5)
                .forEach((x)-> System.out.print(x));

        int val = IntStream
                .range(1,5)
                .sum();
        System.out.println(val);

        Stream.of("Hello", "bottle ", "Africa")
                .sorted()
                .findFirst()
                .ifPresent((x)-> System.out.println(x));
        String []items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter((x)-> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.println(x + ", "));
        System.out.println();
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map((x) -> x*x)
                .average()
                .ifPresent(x -> System.out.println(x));
        System.out.println();
        List<String> listOfItems = Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
        listOfItems.stream()
                .map((x)-> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x + ", "));
        System.out.println();
    }
}
