package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Random;

@Controller("/test-endpoint")
public class TestController {

    public static final Random RANDOM = new Random();

    @Get
    Wrapper<?> fetchSomethingRandom() {
        int r = RANDOM.nextInt(0, 3);
        if (r == 0) {
            return new Wrapper<>("im a string");
        } else if (r == 1) {
            return new Wrapper<>(123);
        } else if (r == 2) {
            return new Wrapper<>(true);
        } else {
            return new Wrapper<>("wut");
        }
    }
}
