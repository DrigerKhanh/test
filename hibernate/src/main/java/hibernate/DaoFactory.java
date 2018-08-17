package hibernate;

import org.hibernate.Session;

public class DaoFactory {
	public void create(Object obj) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
	}
	
	public static void main(String[] args)
	{
		try
		{
			Employee emp=new Employee();
			emp.setFirstName("Quang Khanh");
			emp.setLastName("Chu");
			emp.setSalary(25000);
			DaoFactory fact=new DaoFactory();
			fact.create(emp);
			
		}catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
}
