package javawebclientrickandmorty;

import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {
    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");
    Results getCharacter(){
        ResponseEntity<Results> responseEntity = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(Results.class)
                .block();
        return Objects.requireNonNull(responseEntity).getBody();
    }
}
