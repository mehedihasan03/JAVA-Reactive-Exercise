package com.example;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberflux() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
//        ReactiveSources.intNumbersFlux()
//                .subscribe(numbers -> System.out.println(numbers),
//                        err -> System.out.println(err.getMessage()),
//                        () -> System.out.println("Complete")
//                );

//        Disposable subscibe = ReactiveSources.intNumbersFlux()
//                .subscribe(numbers -> System.out.println(numbers),
//                        err -> System.out.println(err.getMessage()),
//                        () -> System.out.println("Complete")
//                );


        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }
}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribe Heppend");
        request(3);
    }

    public void hookOnNext(T value) {
        System.out.println(value.toString() + " Received");
        request(1);
    }
}