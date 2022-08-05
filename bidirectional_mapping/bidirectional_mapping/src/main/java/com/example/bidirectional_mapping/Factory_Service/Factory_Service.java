package com.example.bidirectional_mapping.Factory_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bidirectional_mapping.Reposetory.Car_Reposetory;
import com.example.bidirectional_mapping.Reposetory.Engineers_Reposetory;
import com.example.bidirectional_mapping.Reposetory.Factory_Repository;
import com.example.bidirectional_mapping.model.Car_Factory;
import com.example.bidirectional_mapping.model.Cars;
import com.example.bidirectional_mapping.model.Engineers;
import com.example.bidirectional_mapping.model.Factory_License;
@Service

public interface Factory_Service {

	@Autowired
	public static final Car_Reposetory car_Reposetory = null;
	@Autowired
	public static final Engineers_Reposetory engineers_Reposetory = null;
   @Autowired
	public static final Factory_Repository factory_Repository = null;
    

    public default  void factoryIntializing (String fact_naem) {
    	factory_Repository.save(new Car_Factory(fact_naem));

    }

    public default  void hiring_engineers(String fact_name, Integer fact_Id) {

    	Car_Factory car_fact = factory_Repository.findById(fact_Id).get();
        Engineers engs= new Engineers(fact_name,car_fact);
        car_fact.hiring_engs(engs);
        factory_Repository.save(car_fact);
    }

    public default  void car_manufacturing(String cars_model, Integer eng_id) {
    	Engineers engs= engineers_Reposetory.findById(eng_id).get();
        Cars car = new Cars(cars_model);
        engs.Selecting_Team(car);
        engineers_Reposetory.save(engs);
    }

    public default  void Selecting_Team (Integer cars_id, Integer eng_id) {
        Cars car= car_Reposetory.findById(cars_id).get();
        Engineers engs= engineers_Reposetory.findById(eng_id).get();
        engs.Selecting_Team(car);
        engineers_Reposetory.save(engs);


    }

    public default  void create_factory_license(String Factory_License_Script, Integer fact_Id) {
        Car_Factory car_Factory= factory_Repository.findById(fact_Id).get();
        car_Factory.setFactory_License(new Factory_License(Factory_License_Script));
        factory_Repository.save(car_Factory);

    }
}
