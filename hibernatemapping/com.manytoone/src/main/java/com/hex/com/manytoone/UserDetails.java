package com.hex.com.manytoone;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="USER")
public class UserDetails {
	
	
	 
	@Id
	@Column(name="USER_ID")
	private int userId;
	 
	@Column(name="USER_NAME")
	private String userName;
	 
	
	 
	 
	@OneToMany
	    @JoinTable(
	        name = "USER_VEHICLE",
	        joinColumns = @JoinColumn(name = "USER_ID"),
	        inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	 
	        private Collection<VehicleDetails> vehicle=new ArrayList<VehicleDetails>();
	public int getUserId() {
		return userId;
	}
	 
	public String getUserName() {
		return userName;
	}
	 
	public Collection<VehicleDetails> getVehicle() {
		return vehicle;
	}
	 
	public void setUserId(int userId) {
		this.userId = userId;
	}
	 
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	public void setVehicle(Collection<VehicleDetails> vehicle) {
		this.vehicle = vehicle;
	}
	 
	}

