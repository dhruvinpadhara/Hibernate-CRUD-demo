package hiber1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="web_one")
public class onem implements Serializable{

	@Id
	@GeneratedValue
	private int uid;
	@Column(name="uname",length=40)
	private String uname;
	@Column(name="mno",length=12)
	private Long mno;
	@OneToOne
	@JoinColumn(name="id")
	private model id;

	public onem(String uname, Long mno, model id) {
		super();
		this.uname = uname;
		this.mno = mno;
		this.id = id;
	}

	public Long getMno() {
		return mno;
	}

	public int getU_id() {
		return uid;
	}

	public String getUname() {
		return uname;
	}
	
	public model getId() {
		return id;
	}

	public onem() {
		super();
	}	
}
