package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class MyController {
    @GetMapping("/demo")
    public Mono<String> grettingMessage(){
        return computeMessage()
                .zipWith(getNameFromDb())
                .map(value -> {
                    return  value.getT1() + value.getT2();
                });
    }
    private  Mono<String> computeMessage(){
        return Mono.just("Hello ")
                .delayElement(Duration.ofSeconds(5));
    }
    private Mono<String> getNameFromDb(){
        return Mono.just("Hi ")
                .delayElement(Duration.ofSeconds(5));
    }
}
