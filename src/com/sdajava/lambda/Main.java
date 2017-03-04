package com.sdajava.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Person> personList =
                Arrays.asList(
                        new Person("Lukasz", "Kowalski",23),
                        new Person("Jan", "Dobry",111),
                        new Person("Abbb", "Zzz",2));


        personList.forEach(s -> System.out.println("Nazwisko: " + s.name));

        Stream.of(1,2,3,4,5,6)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
