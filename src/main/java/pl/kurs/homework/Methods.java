package pl.kurs.homework;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> ins = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            ins.add(random.nextInt());
//
//        }
        System.out.println(ins);
        ins.add(null);

        System.out.println(returnEvenNumbers(ins));
    }

    public static Optional<List<Integer>> returnEvenNumbers(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return Optional.empty();
        }
        List<Integer> integerList = new ArrayList<>();
        Predicate<Integer> isEven = i -> i % 2 == 0;

        for (Integer integer : list) {
            if (integer != null && isEven.test(integer)) {
                integerList.add(integer);
            }
        }
        return Optional.of(integerList);
    }

    public static Optional<String> returnFirstStringStartingJ(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }
        for (String string : strings) {
            if (string != null && string.charAt(0) == 'J') {
                return Optional.of(string);
            }
        }
        return Optional.empty();
    }

    public static Optional<List<Integer>> doubleOptionalValues(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            return Optional.empty();
        }

        List<Integer> integerList = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer != null) {
                integerList.add(integer * 2);
            }
        }
        return Optional.of(integerList);
    }

    //Create a method that filters a list of strings based on a provided predicate and then
    //performs some action on each filtered element using a consumer.

    public static void filterAndProcessStrings(List<String> list, Predicate<String> predicate, Consumer<String> consumer){
        for (String s : list) {
            if (predicate.test(s)){
                consumer.accept(s);
            }
        }
    }

    //Create a method that generates a list of integers
    // based on some rule using a Function and initializes elements using a Supplier.

    public static List<Integer> generateList (List<Integer> list, Function<Integer, Integer> function, Supplier<Integer> supplier){
        List<Integer> integerList = new ArrayList<>();

        for (Integer integer : list) {
            integerList.add(function.apply(supplier.get()));
        }
        return integerList;
    }
}
