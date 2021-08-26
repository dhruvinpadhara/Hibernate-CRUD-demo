package hiber1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="form")
public class Form_model {
	@Id
	@GeneratedValue
	@Column(length=3)
	private int id;
	@Column(length=20)
	private String name;
	@Column(name="number",length=10)
	private long number;
	

	
	public Form_model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Form_model(int id, String name, long number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		
	}
	public Form_model(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getNumber() {
		return number;
	}

	
	
}
