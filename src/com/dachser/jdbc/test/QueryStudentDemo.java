package com.dachser.jdbc.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dachser.model.entity.Student;

public class QueryStudentDemo {
	
	public static void main(String[] args) {


		// Session Factory
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")// by default hibernate.cfg.xml is the default name of the file, if delete it not problem.
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		// create a session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();
			
			/*
			 * Retrieving Student using Hibernate Query Language (HQL) 
			 * */
			
			// query Students
			@SuppressWarnings("unchecked")
			List<Student> students = session.createQuery("from Student").getResultList();
			
			// display Students
			displayStudent(students);
			
			// query student with dmae jacks
			students = session.createQuery("from Student s where s.firstName='jacks' or s.firstName like '%ah%' ").getResultList(); 
			
			// display Students
			System.out.println("\n\n\nStudent who has name jacks or like ah");
			displayStudent(students);
			
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
						
			
		} finally {
			sessionFactory.close();
		}
	}

	private static void displayStudent(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
			
		}
	}
}
