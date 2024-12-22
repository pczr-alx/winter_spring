package pl.alx.cicd.winter_spring.logic;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class OsobyRepo {
    private ConcurrentHashMap<String, Osoba> baza;

    public OsobyRepo() {
        this.baza = new ConcurrentHashMap<>();
        this.baza.put("ala", new Osoba("Ala", "Ala ma kota"));
        this.baza.put("zosia", new Osoba("Zosia", "Samosia"));
	    this.baza.put("kamil", new Osoba("Kamil", "Klaczkiewicz"));
        this.baza.put("patryk1", new Osoba("Patryk", "Fikołek"));
        this.baza.put("janusz", new Osoba("Janusz", "Killer"));
    }

    public Optional<Osoba> getOsoba(String imie) {
        return Optional.ofNullable(baza.get(imie));
    }

}
