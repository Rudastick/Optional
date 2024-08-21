package pl.kurs.test;

import java.util.List;
import java.util.stream.IntStream;

public class TestThree {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers
                .stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 2)
                .map(integer -> Integer.toString(integer))
                .forEach(System.out::println);


        int sum = IntStream.rangeClosed(1, 5)
                .sum();
    }
}
