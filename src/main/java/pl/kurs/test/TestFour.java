package pl.kurs.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class TestFour {
    public static void main(String[] args) {
        Predicate<String> predicate = string -> string.length() > 4;

        System.out.println(filterStringList(List.of("Adam", "Ewa", "dwa", "drzewa"), predicate));

    }

    public static Optional<String> filterStringList(List<String> list, Predicate<String> predicate) {
        Optional<String> first = list
                .stream()
                .filter(predicate)
                .findFirst();
        return first;
    }
}
