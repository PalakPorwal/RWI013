package com.map;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
//		Question q1=new Question();
//		q1.setQuestionId(1212);
//		q1.setQuestion("what is java?");
//		
//		 //creating answer
//		Answer answer=new Answer();
//		answer.setAnswerId(300);
//		answer.setAnswer("java is programming language");
//		answer.setQuestion(q1);
//		
//		Answer answer1=new Answer();
//		answer1.setAnswerId(301);
//		answer1.setAnswer("java is object oriented");
//		answer1.setQuestion(q1);
//		
//				
//		Answer answer2=new Answer();
//		answer2.setAnswerId(302);
//		answer2.setAnswer("java has different type of frameworks");
//		answer2.setQuestion(q1);
//		
//		List<Answer> list=new ArrayList<Answer>();
//		list.add(answer);
//		list.add(answer1);
//		list.add(answer2);
//		
//		q1.setAnswers(list);
		// session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// fetching
		Question q = (Question) s.get(Question.class, 1212);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers().size());
	
		
		// save
//		 s.save(q1);
//		 s.save(answer);
//		 s.save(answer1);
//		 s.save(answer2);
		// s.save(list);

		// fetching
		// Question newQ=(Question)s.get(Question.class, 1212);
		// System.out.println(newQ.getQuestion());
		// System.out.println(newQ.getAnswer().getAnswer());

		tx.commit();
		s.close();
		factory.close();
	}
}
