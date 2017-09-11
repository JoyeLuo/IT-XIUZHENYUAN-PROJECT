package com.test.student.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.student.dao.IStudentDAO;

public class StudentDAOTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");

	}

}
