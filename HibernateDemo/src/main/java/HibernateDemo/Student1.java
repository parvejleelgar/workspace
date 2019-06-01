package HibernateDemo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Student1 {
	
	@Id
	@Column(name="roll_no")
	private int rollno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="marks")
	private int marks;
	
	private Laptop laptop;
	
	
	

	public Laptop getLaptop() {
		return laptop;
	}



	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Student1(String name,int rollno, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}


}

