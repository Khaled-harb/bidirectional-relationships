package com.example.bidirectional_mapping.Reposetory;

import org.springframework.data.repository.CrudRepository;

import com.example.bidirectional_mapping.model.Cars;

public interface Car_Reposetory extends CrudRepository<Cars, Integer>{

}
