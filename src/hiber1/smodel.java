package hiber1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="simple_insert")
public class smodel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="sname",length=30)
	private String name;
	@Column(name="number",length=12)
	private long no;
	
	
	public smodel(int id, String name, long no) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
	}
	public smodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getNo() {
		return no;
	}
	
	
	
}
