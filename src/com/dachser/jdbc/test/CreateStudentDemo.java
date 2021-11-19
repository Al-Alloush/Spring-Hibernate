package com.dachser.jdbc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dachser.model.entity.Student;



public class CreateStudentDemo {

	public static void main(String[] args) {


		// Session Factory
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")// by default hibernate.cfg.xml is the default name of the file, if delete it not problem.
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		// create a session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// use the session object to save Java object
			
			
			// create student object
			System.out.println("Create a new Student object ...");
			Student student = new Student("Ahmad", "Alloush", "alloush@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			
			// save the student object
			System.out.println("Saving the student ...");
			session.save(student);			
			
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		} finally {
			sessionFactory.close();
		}
		
		
	}

}
