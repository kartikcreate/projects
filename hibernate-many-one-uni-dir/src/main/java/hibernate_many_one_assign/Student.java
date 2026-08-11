package hibernate_many_one_assign;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private int sid;
	private String name;
	private int age;
	
	// build the connection
		@ManyToOne
		private Department department;

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

		public Department getTrainer() {
			return department;
		}

		public void setTrainer(Department department) {
			this.department = department;
		}
	
}
