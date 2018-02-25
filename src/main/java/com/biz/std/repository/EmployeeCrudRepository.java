/**  
* <p>Title: EmployeeCrudRepository.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author shenlan  
* @date 2018年2月20日  
* @version 1.0  
*/ 
package com.biz.std.repository;

import org.springframework.data.repository.CrudRepository;

import com.biz.std.model.Employee;

/**
 * @author zzt
 * 2018年2月20日
 * Description: 声明这个接口就可以在其它地方使用该接口下的方法
 */
public interface EmployeeCrudRepository extends CrudRepository<Employee, Integer> {

}
