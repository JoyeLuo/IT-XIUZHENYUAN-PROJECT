package com.test.student.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.student.dao.IStudentDAO;

public class StudentDAOTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");

		/*Student student = new Student();
		student.setId(6);
		student.setName("小红");
		dao.addStudent(student);

		Student student1 = new Student();
		student1.setId(7);
		student1.setName("小明");
		dao.addStudent(student1);

		dao.deleteStudentById(6);

		System.out.println(dao.seachStudentNameById(7));*/
		long before = System.currentTimeMillis();
		dao.seachStudentNameById(20000);
		long after = System.currentTimeMillis();
		long time = after - before;
		System.out.println( time );
		
	}

}
