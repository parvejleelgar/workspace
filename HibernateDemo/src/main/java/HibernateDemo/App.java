package HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateDemo.Student;

public class App {
	
	public static void main(String[] args)
	{
		Laptop laptop = new Laptop(101, "Dell");
		Student1 s = new Student1("Navin", 1, 50);
		
		SessionFactory factory = new Configuration()
				 				.configure("hibernate.cfg.xml")
				 				.addAnnotatedClass(Student1.class)
				 				.addAnnotatedClass(Laptop.class)
				 				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try
		{
		System.out.println("Creating new student object");
		//Student tempStudent1 = new Student("Puall2ddd322", "Walsdsdl2", "pual@luv23code.com");
		
		session.beginTransaction();
		
		System.out.println("Saving the student");
		session.save(laptop);
		session.save(s);
		
		//tempStudent = session.get(Student.class,10);
	
		session.getTransaction().commit();
		
		//System.out.println(tempStudent);
		System.out.println("Done");
		}
		
		finally
		{
			factory.close();
		}
	}

}

