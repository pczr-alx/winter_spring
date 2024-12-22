package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kamil {

    @GetMapping("/kamil")
    public String hello() {
        return "Hello Kamil";
    }

}
