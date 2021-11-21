package com.dachser.jdbc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dachser.model.entity.Student;



public class UpdateStudentDemo {

	public static void main(String[] args) {


		// Session Factory
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")// by default hibernate.cfg.xml is the default name of the file, if delete it not problem.
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		// create a session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			
			int studentId = 2;
			
			Student student = session.get(Student.class, studentId);
			
			student.setFirstName("update Ahmad Name");
			
			
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("update Student who has id: " + studentId);
			
			
			
		} finally {
			sessionFactory.close();
		}
		
		
	}

}
