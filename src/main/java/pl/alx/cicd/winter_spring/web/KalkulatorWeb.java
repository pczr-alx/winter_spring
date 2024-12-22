package pl.alx.cicd.winter_spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.alx.cicd.winter_spring.logic.KalkulatorService;

@RestController
@RequestMapping("/kalkulator")
public class KalkulatorWeb {
    @Autowired
    KalkulatorService kalkulatorService;

    @GetMapping(produces = "text/html;charset=UTF-8")
    public String kalkulator(Long liczba1, Long liczba2, String operacja) {
        Long wynik = null;
        if (liczba1 != null && liczba2 != null && operacja != null) {
            wynik = kalkulatorService.oblicz(liczba1, liczba2, operacja);
        }
        // FYI: to nie jest piękne ani wydajne
        String html = """
            <!DOCTYPE html>
            <html><head>
            <title>Kalkulator serwletowy</title>
            <style>
            form {
                width: 600px;
                background-color: #AAEEFF;
                margin: 2em auto;
                padding: 0.75em;
                border: 4px solid blue;
            }
            
            .wynik {
                width: 600px;
                background-color: #CCFFDD;
                margin: 2em auto;
                padding: 0.75em;
                border: 4px outset green;
            }
            
            .error {
                width: 600px;
                background-color: white;
                color: red;
                margin: 2em auto;
                padding: 0.75em;
                border: 4px double red;
            }
            </style>
            </head>
            <body>
            <h1>Kalkulator</h1>
            <form>
            <input type='number' name='liczba1'>
            <select name='operacja'>
            <option value='+'>+</option>
            <option value='-'>-</option>
            <option value='*'>*</option>
            <option value='/'>/</option>
            </select>
            <input type='number' name='liczba2'>
            <button>Oblicz</button>
            </form>
            """;
        if(wynik != null) {
            html += String.format("<div class='wynik'>%d %s %d = <strong>%d</strong></div>\n",
                    liczba1, operacja, liczba2, wynik);
        }
        html += """
            </body>
            </html>
            """;
        return html;
    }
}

