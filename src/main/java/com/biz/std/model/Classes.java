/**  
* <p>Title: Teacher.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author shenlan  
* @date 2018年2月25日  
* @version 1.0  
*/ 
package com.biz.std.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zzt
 * 2018年2月25日
 * Description: 
 */
@Entity
public class Classes {
	 @GeneratedValue
	 @Id
	private Integer ClassId;
	private String ClassName;
	/**
	 * @return the classId
	 */
	public Integer getClassId() {
		return ClassId;
	}
	/**
	 * @param classId the classId to set
	 */
	public void setClassId(Integer classId) {
		ClassId = classId;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return ClassName;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		ClassName = className;
	}
	

}
