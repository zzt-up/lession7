package com.biz.std.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.std.model.Employee;
import com.biz.std.model.Student;
import com.biz.std.repository.EmployeeCrudRepository;
import com.biz.std.repository.EmployeeJpaRepository;
import com.biz.std.repository.StudentJpaRepository;
import com.biz.std.repository.StudentRepository;
import com.biz.std.util.Page;
import com.biz.std.vo.Category;
@Service
public class CategoryService {

	//继承了CrudRepository接口的类
    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;
    @Autowired
    private EmployeeJpaRepository employeeJpaRepository;
    @Autowired
    private StudentJpaRepository studentJpaRepository;
    @Autowired
    StudentRepository studentRepository;
    
    @Transactional
    public int lista(List<Employee> employees){
    	return 2;
    	
    }

	public List<Employee> lista() {
		
		return employeeJpaRepository.findAll();
	}

	public List<Category> list() {
	
		return null;
	}

	/**
	 * @param employye
	 */
	public void save(Employee employye) {
		employeeCrudRepository.save(employye);
		
	}

	/**
	 * @return
	 */
	public List<Student> listAllStudent() {
		
		return studentJpaRepository.findAll();
	}

	/**
	 * @param id
	 */
	public void delStudentById(Integer id) {
		studentJpaRepository.delete(id);
		
	}

	/**
	 * @param id
	 * @return
	 */
	public List<Student> GetStudentsById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.queryParams1(id);
	}

	/**
	 * @param id
	 * @param age 
	 * @param name 
	 * @param sex 
	 */
	@Transactional
	public void modifyStudentsById(Integer id, String sex, String name, Integer age) {
		studentRepository.modifyStudentsById(id, sex, name, id);
		
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param sex
	 * @param subject
	 * @param classes
	 */
	@Transactional
	public void addStudent(Integer id, String name, String age, String sex, String subject, String classes) {
		// TODO Auto-generated method stub
		/*studentRepository.addStudent(id,name,age,sex,subject,classes);*/
		
	}

	/**
	 * @param student
	 */
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentJpaRepository.save(student);
		
	}

	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param age
	 * @param classes
	 * @param subject
	 * @return
	 */
	@Transactional
	public void studentModify(Integer id, String name, String sex, java.util.Date age, String classes, String subject) {
		/*studentRepository.modifyStudentsById(id,name,sex,age,classes,subject);*/
		studentRepository.modifyStudentsById(id,name);
		
	}



}
