package com.org;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="4_Wheeler")
public class FourWheeler extends Vehicle{
	@Column(name="STEERING_WHEEL")
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

}
