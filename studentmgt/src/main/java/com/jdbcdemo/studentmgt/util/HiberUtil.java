package com.jdbcdemo.studentmgt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {
	
	public Session getSession()
	{
		//create configuration instance
			Configuration cfg=new Configuration();
	        cfg.configure();
	      //create session factory instance
	        SessionFactory factory=cfg.buildSessionFactory();
	      //create session instance
	        Session session=factory.openSession();
	        return session;
	}

}