package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final List<String> quotes = List.of(
            "Code never lies, comments sometimes do.",
            "Java is to JavaScript what car is to Carpet.",
            "Sometimes it pays to stay in bed on Monday."
    );

    @GetMapping
    public String greet(){
        return quotes.get(new Random().nextInt(0, quotes.size()));
    }
}
