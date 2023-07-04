package javawebclientrickandmorty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    private final Service service;

    @Autowired
    public Controller(Service service) {this.service = service;}

    @GetMapping("/character")
        public List<Character> getCharacters() {
        return service.getCharacter().results();
        }
}
