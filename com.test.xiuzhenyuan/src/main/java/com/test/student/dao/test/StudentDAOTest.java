package com.test.student.dao.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.student.dao.IStudentDAO;

public class StudentDAOTest {

	public static Logger logger = Logger.getLogger(StudentDAOTest.class.getName() );
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentDAO dao=(IStudentDAO) applicationContext.getBean("studentDao");

        printLog();
		
	}

	private static  void printLog(){

       /* PropertyConfigurator.configure("log4j.properties");*/
        logger.debug("debug info");
        logger.error("error info");
        logger.fatal("fatal info");
        logger.warn("warn info");
        logger.error("error info");
    }

}
