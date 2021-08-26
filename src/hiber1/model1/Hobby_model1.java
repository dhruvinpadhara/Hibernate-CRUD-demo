package hiber1.model1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hobby1")
public class Hobby_model1 implements Serializable{

	@Id
	@GeneratedValue
	private int hid;
	
	@Column(length=20)
	private String hname;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
	@JoinColumn(name="uid")
	private User_model uid;

	public Hobby_model1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hobby_model1(int hid, String hname, User_model uid) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.uid = uid;
	}

	public Hobby_model1(String hname, User_model uid) {
		super();
		this.hname = hname;
		this.uid = uid;
	}

	public int getHid() {
		return hid;
	}

	public String getHname() {
		return hname;
	}

	public User_model getUid() {
		return uid;
	}
	
}
