/*package com.how2java.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.biz.std.model.Employee;
import com.biz.std.model.Student;
import com.biz.std.repository.EmployeeCrudRepository;
import com.biz.std.repository.EmployeeJpaRepository;
import com.biz.std.service.CategoryService;
import com.biz.std.vo.Category;


@Service
public class CategoryServiceImpl  implements CategoryService{
	
	//继承了CrudRepository接口的类
    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;
    @Autowired
    private EmployeeJpaRepository employeeJpaRepository;
    //此方法涉及事务需要使用注解，一个Service方法可能涉及几个dao层的方法
    //继承了对应接口中的一个方法，下面注解是一个事务方法
    @Transactional
    public int lista(List<Employee> employees){
    	return 2;employeeCrudRepository.findAll();
    	
    }

	public List<Employee> lista() {
		// TODO Auto-generated method stub
		return employeeJpaRepository.findAll();
	}

	public List<Category> list() {
	
		return null;
	}




}
*/