package com.example.bidirectional_mapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bidirectional_mapping.Factory_facade.Factory_Facade;

@RestController

@RequestMapping(path = "/Car_Factory")
public class FactoryController {
	
       @Autowired
        private final Factory_Facade factory_Facade = new Factory_Facade();

	    @PostMapping(path="/itialize_factory")
	    public void factory_Intializing(@RequestParam String fact_name){
	    	factory_Facade.createOrganization(fact_name);


	    }
	    @PostMapping(path="/hiring_engineers")
	    public void hiring_engineers(@RequestParam String eng_name,Integer fact_Id){

	    	factory_Facade.hiring_engineers(eng_name,fact_Id);
	    }
	    @PostMapping(path = "/car_manufacturing")
	    public void car_manufacturing(@RequestParam String cars_model,Integer eng_id){
	    	factory_Facade.car_manufacturing(cars_model, eng_id);

	    }
	    @PostMapping(path="/selecting_engineers")
	    public void selecting_engineers(@RequestParam Integer cars_id,Integer eng_id){
	    	factory_Facade.selecting_engineers(cars_id,eng_id);
	    }
	    @PostMapping(path="/getting_factory_license ")
	    public void getting_factory_license(@RequestParam String Factory_License_Script,Integer fact_Id){
	    	factory_Facade.create_factory_license(Factory_License_Script,fact_Id);
	    }
}
