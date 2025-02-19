package com.hex.com.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class VehicleDetails {
	
	 
	
	
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	 
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	 
	public int getVehicleId() {
		return vehicleId;
	}
	 
	public String getVehicleName() {
		return vehicleName;
	}
	 
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	 
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	 
	}

