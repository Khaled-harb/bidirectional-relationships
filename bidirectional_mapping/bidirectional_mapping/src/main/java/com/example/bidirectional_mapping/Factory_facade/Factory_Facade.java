package com.example.bidirectional_mapping.Factory_facade;

import org.springframework.stereotype.Service;

import com.example.bidirectional_mapping.Factory_Service.Factory_Service;
@Service

public class Factory_Facade {
	private final Factory_Service factory_Service = null;

	public void createOrganization(String name) {
		factory_Service.factoryIntializing(name);
	}

	public void hiring_engineers(String fact_name, Integer fact_Id) {

		factory_Service.hiring_engineers(fact_name, fact_Id);
	}

	public void car_manufacturing(String cars_model, Integer eng_id) {
		factory_Service.car_manufacturing(cars_model, eng_id);
	}

	public void selecting_engineers(Integer fact_Id, Integer eng_id) {
		factory_Service.Selecting_Team(fact_Id, eng_id);
	}

	public void create_factory_license(String Factory_License_Script, Integer fact_Id) {
		factory_Service.create_factory_license(Factory_License_Script, fact_Id);
	}
}