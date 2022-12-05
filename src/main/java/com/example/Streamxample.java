package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Streamxample {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5, 8, 5, 7, 8, 3, 1, 2, 7, 4, 9);

//        Predicate<Integer> predi = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if (integer > 6)
//                    return true;
//                else
//                    return false;
//            }
//        };
//        Predicate<Integer> predi = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 6;
//            }
//        };

        Predicate<Integer> predi = n -> n > 6;

        num.stream()
                .filter(predi)  //.filter(n -> n>6)
                .sorted()
                .distinct()
                .map(n -> n + 2)
                .forEach(n -> System.out.println(n));
    }
}
