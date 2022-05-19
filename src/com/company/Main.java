package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList();
        String[] array = {"Kasia", "Aneta", "Mateusz"};
        String string = Arrays.toString(array);
        System.out.println(string);

        Stream<String> stream = Arrays.stream(array);

        int[] ints = new int[100];
        Arrays.fill(ints, 0, 51, 10);
        Arrays.fill(ints, 51, 100, 20);
        System.out.println(ints);

        Arrays.sort(ints);

        System.out.println(ints);
    }
}
