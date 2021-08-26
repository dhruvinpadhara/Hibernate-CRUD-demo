package hiber1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="form_1")
public class Form_model1 {
		@Id
		@GeneratedValue
		@Column(length=3)
		private int id;
		@Column(length=20)
		private String name;
		@Column(name="number",length=10)
		private long number;
		@Column(name="hobby",length=50)
		private String hobby;
		
		public Form_model1() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Form_model1(int id, String name, long number, String hobby) {
			super();
			this.id = id;
			this.name = name;
			this.number = number;
			this.hobby = hobby;
		}

		public Form_model1(int id) {
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
