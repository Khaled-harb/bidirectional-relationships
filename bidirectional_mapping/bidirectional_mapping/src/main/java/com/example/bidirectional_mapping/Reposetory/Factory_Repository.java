package com.example.bidirectional_mapping.Reposetory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirectional_mapping.model.Car_Factory;

@Repository
public interface Factory_Repository extends CrudRepository<Car_Factory,Integer>{

}
