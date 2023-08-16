package hibernateApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentWithAnnotation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	int id;
	
	@Column(name = "STD_roll_no")
	int roll_no;
	
	@Column(name="STD_name")
	String name;
	
	@Column(name="STD_address")
	String address;
	
	public StudentWithAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentWithAnnotation(int id, int roll_no, String name, String address) {
		super();
		this.id = id;
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentWithAnnotation [id=" + id + ", roll_no=" + roll_no + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	
	
}
