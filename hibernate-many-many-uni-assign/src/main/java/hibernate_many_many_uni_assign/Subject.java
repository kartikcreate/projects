package hibernate_many_many_uni_assign;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {
@Id
private int id;
private String sname;
private int days;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}

}
