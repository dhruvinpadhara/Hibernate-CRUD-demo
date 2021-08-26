package hiber1;

import javax.persistence.Column;
import javax.persistence.Entity;import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="hobby")
public class Hobby_model {
	@Id
	@GeneratedValue
	@Column(length=3)
	private int hobyy_id;
	@Column(length=20)
	private String hobby;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Form_model form;
	
	public Hobby_model(String hobby, Form_model form) {
		super();
		this.hobby = hobby;
		this.form = form;
	}
	public int getHobyy_id() {
		return hobyy_id;
	}
	public String getHobby() {
		return hobby;
	}
	

}
