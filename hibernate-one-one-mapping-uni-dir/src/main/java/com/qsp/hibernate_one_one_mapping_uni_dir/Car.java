package com.qsp.hibernate_one_one_mapping_uni_dir;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Car {
	@Id
	private int cid;
	private String name;
	private double price;
// to build relationship between can and engine
	//1 create reference of engine>>>> in context of java>>>> connect 
	//2. use proper mapping annotation >>>>in context of hibernate.
	/// only reference is created object is not created hence it is aggregation.
	//
	
	   @OneToOne
	private Engine engine;
	
	
	
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
