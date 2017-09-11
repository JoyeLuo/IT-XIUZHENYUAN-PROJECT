
package com.test.student.dao;

import com.test.student.model.Student;

public interface IStudentDAO {
	
	public void addStudent(Student student);

	public void deleteStudentById(int id);

	public void updateStudent(Student student);

	public String seachStudentNameById(int id);
}
