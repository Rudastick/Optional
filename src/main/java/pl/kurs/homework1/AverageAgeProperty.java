package pl.kurs.homework1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AverageAgeProperty {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(25),
                new Person(30),
                new Person(35),
                new Person(40),
                new Person(45)
        );
        double averageAgeBySpecificProperty = getAverageAgeBySpecificProperty(people, person -> person.getAge() > 35);
        System.out.println(averageAgeBySpecificProperty);
    }
    public static double getAverageAgeBySpecificProperty(List<Person> personList, Predicate<Person> predicate) {
        return personList
                .stream()
                .filter(predicate)
                .mapToDouble(Person::getAge)
                .average()
                .orElse(0.0);
        // pięknie dzis wygladasz Panie Toamszu <3
    }
}
