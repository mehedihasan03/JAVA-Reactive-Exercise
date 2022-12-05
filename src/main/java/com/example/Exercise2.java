package com.example;

import reactor.core.publisher.Flux;

import java.io.IOException;
import java.time.Duration;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));

//        ReactiveSources.intNumbersFlux().subscribe(numbers -> System.out.println(numbers),
//                err -> System.out.println(err.getMessage()),
//                () -> System.out.println("Complete")
//        );


        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
//        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));
//
//        Flux<String> flux1 = Flux.just("A", "B", "C", "D", "E")
//                .delayElements(Duration.ofSeconds(1));
//
//        Flux<Integer> flux2 = Flux.just(1, 2, 3, 4, 5)
//                .delayElements(Duration.ofSeconds(1));
//
//        flux2.concatWith(ReactiveSources.intNumbersFlux())
//                .subscribe(System.out::println);


        System.out.println("Press a key to end");
        System.in.read();
    }

}
