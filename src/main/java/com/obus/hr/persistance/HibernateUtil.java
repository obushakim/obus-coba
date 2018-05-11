package com.obus.hr.persistance;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static String typee = "annotation";
	private static final SessionFactory sessionFactory = buildSessionFactory(typee);
	
	
	
	private static SessionFactory buildSessionFactory(String type){
		Configuration sessionType = new AnnotationConfiguration();
		
		if(type == "xml"){
			sessionType = new Configuration();
		}
		
		try {
			return sessionType.configure().buildSessionFactory();
		} catch (Throwable ex){
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}	
		
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory(String type){
		typee = type;
		
		return sessionFactory;
	}
	
	public static void shutdown(){
		getSessionFactory().close();
	}
}