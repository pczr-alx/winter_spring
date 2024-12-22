package pl.alx.cicd.winter_spring.logic;

import org.springframework.stereotype.Service;

@Service
public class KalkulatorService {

    public long oblicz(long arg1, long arg2, String operacja) {
        return switch (operacja) {
            case "+" -> arg1 + arg2;
            case "-" -> arg1 - arg2;
            case "*" -> arg1 * arg2;
            default -> 0;
        };
    }
}

