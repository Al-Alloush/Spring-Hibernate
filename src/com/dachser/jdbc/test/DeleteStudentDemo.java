package com.dachser.jdbc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dachser.model.entity.Student;



public class DeleteStudentDemo {

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
			
			// delete the student using Hibernate
			//session.delete(student);
			// OR using Hibernate Query language
			session.createQuery("delete from Student where id=2 ").executeUpdate();
			
			
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Delete Student who has id: " + studentId);
			
			
			
		} finally {
			sessionFactory.close();
		}
		
		
	}

}
