package com.example;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        // ReactiveSources.intNumberMono().subscribe(num -> System.out.println(num));

//        ReactiveSources.intNumberMono()
//                .subscribe(numbers -> System.out.println(numbers),
//                        err -> System.out.println(err.getMessage())
//                );

        ReactiveSources.intNumberMono()
                .subscribe(numbers -> System.out.println(numbers),
                        err -> System.out.println(err.getMessage()),
                        () -> System.out.println("Complete")
                );

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        // Optional<User> number = ReactiveSources.userMono().blockOptional();
        // Integer number = ReactiveSources.intNumberMono().block();
        // User user = ReactiveSources.userMono().block();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
