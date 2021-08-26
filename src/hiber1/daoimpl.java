package hiber1;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class daoimpl implements dao{
	
	public <E> void insert(E m) {
		Session ses=null;
		Transaction t=null;
		
		try{
			ses=utilimpl.connect();
			t=ses.beginTransaction();
			ses.save(m);
			t.commit();
		}
		catch(HibernateException e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println(e);
		}
		
		finally{
			//ses.close();
		}
	}

	public List view(String name) {
		Session ses=null;
		Transaction t=null;
		List lis=null;
		try{
			ses=utilimpl.connect();
			t=ses.beginTransaction();
			Query q=ses.createQuery("from "+name+"");
			lis=q.list();
			t.commit();
		}
		catch(HibernateException e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println(e);
		}
		
		finally{
			//ses.close();
		}
		return lis;
	}

	public <E> void update(E m) {
		Session ses=null;
		Transaction t=null;
		
		try{
			ses=utilimpl.connect();
			t=ses.beginTransaction();
			ses.update(m);
			t.commit();
		}
		catch(HibernateException e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println(e);
		}
		
		finally{
			//ses.close();
		}		
	}

	public <E> E getData(E r, int id) {
		E lis = null;
		Session ses = null;
		Transaction t = null;
		try{
			ses = utilimpl.connect();
			t = ses.beginTransaction();
			lis = (E) ses.get(r.getClass(),id);
			t.commit();
		}
		catch (HibernateException e) {
			if(t != null)
			{
				t.rollback();
			}
			System.out.println(e);
		}
		finally {
			//ses.close();
		}
		return lis;
	}

	public <E> void delete(E m) {
		Session ses = null;
		Transaction t = null;
		try{
			ses = utilimpl.connect();
			t = ses.beginTransaction();
			ses.delete(m);;
			t.commit();
		}
		catch (HibernateException e) {
			if(t != null)
			{
				t.rollback();
			}
			System.out.println(e);
		}
		finally {
			//ses.close();
		}
		
	}
}
