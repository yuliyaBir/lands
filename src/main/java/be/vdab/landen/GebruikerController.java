package be.vdab.landen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("/")
public class GebruikerController {
    GebruikerController() throws IOException {
        var homeDirectory = Path.of(System.getProperty("user.home"));
        var file = homeDirectory.resolve("organisatie.txt");
        if (!Files.exists(file)){
            Files.writeString(file, "VDAB");
            System.out.println(file + " gemaakt");
        }
        System.out.println("Besturingssysteem: " + System.getProperty("os.name"));
        System.out.println("Gebruikersnaam: " + System.getProperty("user.name"));
        System.out.println("Home directory van de gebruiker: " + System.getProperty("user.home"));
    }
}
