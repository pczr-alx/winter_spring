package pl.alx.cicd.winter_spring.web;

import org.springframework.web.bind.annotation.RestController;

import pl.alx.cicd.winter_spring.logic.Osoba;
import pl.alx.cicd.winter_spring.logic.OsobyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/osoby")
public class OsobyController {

    @Autowired
    private OsobyRepo repo;

    @GetMapping(path="/{imie}", produces="application/json")
    public Osoba dajOsobe(@PathVariable String imie) {
       return repo.getOsoba(imie).orElseThrow(() -> new WebServerException("Nie ma takiej osoby", null));
    }
}
