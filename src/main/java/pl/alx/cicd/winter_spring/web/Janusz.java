package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zosia {

    @GetMapping("/zosia")
    public String hello() {
        return "Hello Zosia samosia";
    }

}
