package com.qsp.hibernate_mapping_many_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Department {
@Id
private int sid;
private String name;
private int age;
@ManyToMany
private List<Subject>subject;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Subject> getSubject() {
	return subject;
}
public void setSubject(List<Subject> subject) {
	this.subject = subject;
}

}
