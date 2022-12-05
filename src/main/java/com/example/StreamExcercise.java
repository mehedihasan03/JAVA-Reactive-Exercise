package com.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class StreamExcercise {
    public static void main(String[] args) {

        // Generating Streams
        List<String> strings = Arrays.asList("asd", "fgh", "", "qwe", "", "zxc", "poi");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println(filtered);

        // for each
        Random randomNumber = new Random();
        randomNumber.ints()
                .limit(5)
                .forEach(System.out::println);

        // map
        List<Integer> intNum = Arrays.asList(2, 3, 4, 5, 6, 7, 7, 8, 6, 9, 7, 1, 6, 8, 7, 4, 1, 5, 7);
        List<Integer> uniqueNum = intNum.stream().map(num -> num * num).distinct().toList();
        System.out.println(uniqueNum);

        // filter
        List<String> stringList = Arrays.asList("vd", "ed", "oh", "", "ue", "", "ds");
        int counting = (int) stringList.stream().filter(st -> !st.isEmpty()).count();
        System.out.println(counting);

        // sorted
        Random random = new Random();
        random.ints().limit(3).sorted().forEach(System.out::println);

        //limit
        Random random1 = new Random();
        random1.longs().limit(2).forEach(System.out::println);

        //Parallel Processing
        List<String> parallelNum = Arrays.asList("dr", "fg", "", "it", "op", "", "dd", "", "ef");
        long countingNum = parallelNum.stream().filter(st -> st.isEmpty()).count();
        System.out.println(countingNum);

        //Math calculation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt((num) -> num).summaryStatistics();
        System.out.println("Max: " + summaryStatistics.getMax());
        System.out.println("Avg: " + summaryStatistics.getAverage());
        System.out.println("Min: " + summaryStatistics.getMin());
        System.out.println("SUM: " + summaryStatistics.getSum());


    }
}
