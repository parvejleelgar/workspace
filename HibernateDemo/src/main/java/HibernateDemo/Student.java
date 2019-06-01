package HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="aname")
	private EmbeddedExample aname;
	
//	@Column(name="last_name")
//	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
	public Student()
	{
		
	}


	public Student(int id,EmbeddedExample aname, /* String lastName, */ String email) {
	
		this.id = id;
		this.aname = aname;
		
		//this.lastName = lastName;
		
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



/*
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
*/

	public EmbeddedExample getaName() {
		return aname;
	}


	public void setaName(EmbeddedExample aName) {
		this.aname = aname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", aname=" + aname + ", email=" + email + "]";
	}


	
	
}

//

