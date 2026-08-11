package com.qsp.hibernate_one_one_mapping_uni_dir;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
/// dependent class 
public class Engine {
	@Id
	private int eid;
	private String type;
	private String hp;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
}
