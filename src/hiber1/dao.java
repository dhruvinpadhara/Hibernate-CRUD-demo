package hiber1;

import java.util.List;

public interface dao {

	<E> void insert(E m);
	
	//view data
	public List view(String name);

	//update data
	<E> void update(E m);

	//delete data
	<E> void delete(E m);
	//get data
	<E>	E getData(E e,int id);
}
