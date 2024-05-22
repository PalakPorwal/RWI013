package com.palak;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
	
		Student student1=new Student();
		student1.setId(1001);
		student1.setName("Palak Porwal");
		student1.setCity("Indore");
		
		Certificate certificate=new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("3 months");
		student1.setCerti(certificate);
		
		Student student2=new Student();
		student2.setId(1002);
		student2.setName("Madhav Paliwal");
		student2.setCity("Indore");
		
		Certificate certificate1=new Certificate();
		certificate1.setCourse("Python");
		certificate1.setDuration("5 months");
		student2.setCerti(certificate1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(student1);
		s.save(student2);
		
		tx.commit();
		s.close();
		
		
		factory.close();
	}
}
