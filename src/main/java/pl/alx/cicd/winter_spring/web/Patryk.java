package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patryk {

    @GetMapping("/patryk")
    public String hello() {
        return "<img src=\"https://www.thesprucepets.com/thmb/xUQBtJw4wLe3S6Fn-MGPWXi2lFo=/2000x1500/filters:fill(auto,1)/GettyImages-469029193-58179c5d5f9b581c0b86ab9b.jpg\">";
    }

}
