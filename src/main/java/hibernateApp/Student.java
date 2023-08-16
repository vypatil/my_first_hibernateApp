package hibernateApp;

public class Student {

	int id;
	int roll_no;
	String name;
	String adress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int roll_no, String name, String adress) {
		super();
		this.id = id;
		this.roll_no = roll_no;
		this.name = name;
		this.adress = adress;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll_no=" + roll_no + ", name=" + name + ", adress=" + adress + "]";
	}
	
	
	
	

	
}
