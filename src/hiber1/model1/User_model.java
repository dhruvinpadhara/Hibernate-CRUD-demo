package hiber1.model1;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
public class User_model implements Serializable{
	@Id
	@GeneratedValue
	private int uid;
	
	@Column(length=30)
	private String uname;
	
	private long number;

	@OneToMany(mappedBy="uid",cascade=CascadeType.REMOVE)
	private List<Hobby_model1> hob;
	
	public User_model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_model(int uid) {
		super();
		this.uid = uid;
	}

	public User_model(int uid, String uname, long number) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.number = number;
	}

	public User_model(String uname, long number) {
		super();
		this.uname = uname;
		this.number = number;
	}

	public int getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public long getNumber() {
		return number;
	}

	public List<Hobby_model1> getHob() {
		return hob;
	}
	
}
