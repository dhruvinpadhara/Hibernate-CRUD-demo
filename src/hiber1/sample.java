package hiber1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sample")
public class sample {
	@Id
	@GeneratedValue
	@Column(length=3)
	private int id;
	@Column(length=30)
	private String fname;
	@Column(length=30)
	private String lname;
	public sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sample(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public sample(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
