package org.example.controller;

import org.example.dtos.MessageDto;
import org.example.dtos.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public ResponseEntity<org.example.dtos.MessageDto> hi(){
        return ResponseEntity.ok(new MessageDto("hi"));
    }

    @GetMapping("/hello")
    public ResponseEntity<MessageDto> hello(){
        return ResponseEntity.ok(new MessageDto("hello"));
    }

}

