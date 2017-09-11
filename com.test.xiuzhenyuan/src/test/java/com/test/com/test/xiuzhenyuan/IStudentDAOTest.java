package com.test.com.test.xiuzhenyuan;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.student.dao.IStudentDAO;
import com.test.student.model.Student;


public class IStudentDAOTest {

	@Test
	public void testAddStudent() {

		Student student = new Student();
		student.setId(3);
		student.setName("admin");

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");
		dao.addStudent(student);

		String name = dao.seachStudentNameById(3);
		assertEquals("admin", name );
	}

	@Test
	public void testDeleteStudentById() {

		Student student = new Student();
		student.setId(4);
		student.setName("admin");

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");

		dao.addStudent(student);

		dao.deleteStudentById(4);

	}

	@Test
	public void testUpdateStudent() {

		Student student = new Student();
		student.setId(1);
		student.setName("joye");

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");
		dao.addStudent(student);

		student.setName("hibou");

		dao.updateStudent(student);

		String name = dao.seachStudentNameById(1);
		assertEquals("hibou", name );
	}

	@Test
	public void testSeachStudentByName() {

		Student student = new Student();
		student.setId(2);
		student.setName("jonathan");

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");
		
		dao.addStudent(student);

		String name = dao.seachStudentNameById(2);

		 assertEquals("jonathan", name );		
	}

}
