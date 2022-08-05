package com.example.bidirectional_mapping.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cars_id;
	@Column
	private String cars_model;
	@ManyToMany(mappedBy = "cars", cascade = CascadeType.ALL)
	private List<Engineers> engineers = new ArrayList<>();

	public Cars(String cars_model) {
		super();
		this.cars_model = cars_model;
	}

	public Cars(int cars_id, String cars_model) {
		super();
		this.cars_id = cars_id;
		this.cars_model = cars_model;
	}

	public void setCars_id(int cars_id) {
		this.cars_id = cars_id;
	}

	public void setCars_model(String cars_model) {
		this.cars_model = cars_model;
	}

	public void setEngineers(List<Engineers> engineers) {
		this.engineers = engineers;
	}

}
