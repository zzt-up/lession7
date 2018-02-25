/**  
* <p>Title: EmployeePagingAndSortingRepository.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author shenlan  
* @date 2018年2月20日  
* @version 1.0  
*/ 
package com.biz.std.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.biz.std.model.Employee;

/**
 * @author zzt
 * 2018年2月20日
 * Description:此接口包含分页和排序功能 
 */
public interface EmployeePagingAndSortingRepository extends PagingAndSortingRepository<Employee, Integer> {

}
