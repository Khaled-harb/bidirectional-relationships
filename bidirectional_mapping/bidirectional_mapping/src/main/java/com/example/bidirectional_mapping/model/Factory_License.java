package com.example.bidirectional_mapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Factory_License")
public class Factory_License {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Factory_License_Id;
@Column
private String Factory_License_Script;

@OneToOne(mappedBy = "factory_License")
private Car_Factory car_Factory;

public Factory_License(String factory_License_Script) {
	super();
	Factory_License_Script = factory_License_Script;
}

}
