package hiber1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="radix")
public class model implements Serializable{
	

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="firstname",length=30)
	private String fname; 
	@Column(name="lastname",length=30)
	private String lname;
	public model(){
		
	}
	public model(int id) {
		super();
		this.id = id;
	}
	public model(String fname,String lname) {
		
		this.fname = fname;
		this.lname=lname;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public int getId() {
		return id;
	}
	public model(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
}
