package HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
	
	@Id
	@Column(name="lid")
	private int lid;
	
	@Column(name="lname")
	private String lname;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Laptop(int lid, String lname) {
		this.lid = lid;
		this.lname = lname;
	}
	
	
	
	
	

}

