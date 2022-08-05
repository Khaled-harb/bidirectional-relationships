package com.example.bidirectional_mapping.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@Entity
@Table(name = "Engineers")

public class Engineers {
	@Override
	public String toString() {
		return "Engineers [eng_id=" + eng_id + ", eng_name=" + eng_name + ", car_Factory=" + car_Factory + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eng_id;
	@Column
	private String eng_name;

	@ManyToOne
	@JoinColumn(name = "Car_Factory_Id")
    Car_Factory car_Factory;
    @Fetch(value = FetchMode.SUBSELECT)
	@ManyToMany(cascade=CascadeType.ALL,  fetch = FetchType.EAGER)
	@JoinTable(
			name="Factory production",
			//have issues here
			joinColumns=@JoinColumn(name = "engineers_Id"),
			inverseJoinColumns = @JoinColumn(name = "car_Id")
			
			)
	private List<Cars> cars = new ArrayList<>();

	public Engineers(String eng_name, Car_Factory car_Factory) {
		super();
		this.eng_name = eng_name;
		this.car_Factory = car_Factory;
	}

	public Engineers(int eng_id, String eng_name, Car_Factory car_Factory) {
		
		this.eng_id = eng_id;
		this.eng_name = eng_name;
		this.car_Factory = car_Factory;
	}

	public void Selecting_Team(Cars car){
        cars.add(car);
    }


}

