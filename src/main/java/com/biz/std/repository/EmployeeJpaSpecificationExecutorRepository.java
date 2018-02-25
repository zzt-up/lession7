/**  
* <p>Title: EmployeePagingAndSortingRepository.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author shenlan  
* @date 2018年2月20日  
* @version 1.0  
*/ 
package com.biz.std.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.biz.std.model.Employee;

/**
 * @author zzt
 * 2018年2月20日
 * Description:使用Jpa分页和排序Repository的时候，需要添加查询条件的时候 ，
 * 使用JpaSpecificationExecutor接口（使用同时继承）
 */
public interface EmployeeJpaSpecificationExecutorRepository 
extends JpaRepository<Employee, Integer>,JpaSpecificationExecutor<Employee> {

}
