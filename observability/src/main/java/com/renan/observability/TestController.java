package com.renan.observability;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello (@PathParam("name") String name) {
        if("error".equalsIgnoreCase(name)) {
            return new ResponseEntity<>(("ERRO INESPERADO"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return ResponseEntity.ok("Hello, " + name);
    }

}
