package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    public Service service;
    @PostMapping("/createEntity")
    public ResponseEntity<entity> createEntity(@RequestBody entity Entity){
        entity e = service.createEntity(Entity);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/getEntity/{name}")
    public ResponseEntity<entity> getByName(@PathVariable String name){
        entity e = service.getEntity(name);
        return ResponseEntity.ok(e);

    }
}
