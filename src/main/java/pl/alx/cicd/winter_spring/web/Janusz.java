package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Janusz {

    @GetMapping("/janusz")
    public String hello() {
        return "Hello Janusz";
    }

}
