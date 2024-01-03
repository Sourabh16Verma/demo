package com.example.demo;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

public class Service {

    @Autowired
    public EntityRepo entityRepo;

    public entity createEntity(entity Entity){
        return entityRepo.save(Entity);
    }
    public entity getEntity(String name){
        return entityRepo.findByName(name);
    }
}
