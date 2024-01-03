package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EntityRepo extends CrudRepository<entity,Long> {

    public entity findByName(String name);
}
