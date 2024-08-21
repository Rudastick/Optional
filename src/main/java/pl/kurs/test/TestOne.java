package pl.kurs.test;

import java.util.Optional;
import java.util.function.Consumer;

public class TestOne {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        Optional<String> dupa = Optional.of("Dupa");
        printOptionalState(empty);
        printOptionalState(dupa);



    }

    public static <T> void printOptionalState(Optional<T> optional) {
        if (optional.isPresent()) {
            System.out.println("Empty Optional");
        } else System.out.println("Non Empty Optional");
    }
}
