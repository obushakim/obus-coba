package com.obus.hr;

import org.hibernate.Session;

import com.obus.hr.domain.EmployeeAnnot;
import com.obus.hr.persistance.HibernateUtil;

public class App {
	public static void main(String[] args){
		System.out.println("maven + Hibernate SQL");
		HibernateUtil.shutdown();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Session sessionXml = HibernateUtil.getSessionFactory("xml").openSession();
		
		nyoba(session);
		nyoba(sessionXml);
	}
	
	public static void nyoba(Session session){
		session.beginTransaction();
		EmployeeAnnot emp = new EmployeeAnnot();
		
		emp.setFirstName("iiiiiiiiiiiii");
		emp.setLastName("iiiiiiiiiiii");
		emp.setSalary(12345);
		
		session.save(emp);
		session.getTransaction().commit();
	}
}
