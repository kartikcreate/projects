package hibernate_one_many_mapping_bidirectional;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Trainer {
@Id
private int tid;
private String name;
private double salary;
@OneToMany
private List<Student>Students;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public List<Student> getStudents() {
	return Students;
}
public void setStudents(List<Student> students) {
	Students = students;
}

}
