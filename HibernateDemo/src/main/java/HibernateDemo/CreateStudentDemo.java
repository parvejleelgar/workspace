package HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
	
	public static void main(String[] args)
	{
		EmbeddedExample ee = new EmbeddedExample("Hemant ","kumar","Tank");
		//ee.setFname("Shahid");
		//ee.setLname("bhai");
		//ee.setMname("tailor");
		
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try
		{
			System.out.println("Creating new student object");
			Student tempStudent = new Student(17, ee, "ad@gmail.com");
			//Student tempStudent1 = new Student("Puall2ddd322", "Walsdsdl2", "pual@luv23code.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student");
			session.save(tempStudent);
			
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
