package com.org;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="2_Wheeler")
public class TwoWheeler extends Vehicle {
	@Column(name="STEERING_HANDLE")
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

}
