package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {
    @GetMapping("ping-pong")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok().build();
    }
}
