package pl.kurs.homework;

import java.util.*;

public class OptionalsAndStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,5, 6, 7, 7);

        System.out.println(getFiveBiggestIntegers(list));

    }

    public static List<Integer> getFiveBiggestIntegers (List<Integer> integerList){
        return Optional.ofNullable(integerList)
                .filter(list -> list.size() > 5)
                .map(list -> list.stream()
                        .sorted(Comparator.reverseOrder())
                        .distinct()// - jak chcemy zeby nie powtarzały sie liczby
                        .limit(5)
                        .toList())
                .orElse(Collections.EMPTY_LIST);


    }
}
