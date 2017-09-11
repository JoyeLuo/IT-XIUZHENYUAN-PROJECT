package com.test.student.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.test.student.dao.IStudentDAO;
import com.test.student.model.Student;

public class StudentDAOImpl extends JdbcDaoSupport implements IStudentDAO{

	public void addStudent(Student student) {

		String sql = "insert into student values(?,?)";
		this.getJdbcTemplate().update(sql, student.getId(), student.getName());		
	}

	public void deleteStudentById(int id) {

		String sql = "delete from student where id=?";
		this.getJdbcTemplate().update(sql, id );	
		
	}

	public void updateStudent(Student student) {

		String sql = "update student set name=? where id=?";
		 this.getJdbcTemplate().update(sql, student.getName(),student.getId());
		
	}

	public String seachStudentNameById(int id) {

		String sql = "select name from student where id=?";
		return  this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

}
