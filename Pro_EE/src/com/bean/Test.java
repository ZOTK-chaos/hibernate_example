package com.bean;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		// 2.创建SessionFactory对象
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		// 3.创建session对象
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employed employed = new Employed();
		employed.setName("aa");
		employed.setJob("clerk");
		employed.setDeptno(20);
		employed.setEmpno(7778);
		session.save(employed);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
