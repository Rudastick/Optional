package pl.kurs.test;

import java.util.Optional;
import java.util.function.Supplier;

public class TestTwo {
    public static void main(String[] args) {

    }

    public static <T> T returnValueOrDefault (Optional<T> optional, T defaultValue){
        return optional.orElse(defaultValue);
    }
}
