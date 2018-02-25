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
import org.springframework.data.repository.PagingAndSortingRepository;

import com.biz.std.model.Employee;

/**
 * @author zzt
 * 2018年2月20日
 * Description:
 */
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

}
