package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RootController {

    @GetMapping(path="/", produces="text/html;charset=UTF-8")
    public String index() {
        return "<strong>Hello world!</strong>";
    }
}
