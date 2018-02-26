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
	private Integer classId;
	private String className;
	/**
	 * @return the classId
	 */
	public Integer getClassId() {
		return classId;
	}
	/**
	 * @param classId the classId to set
	 */
	
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + "]";
	}

	/**
	 * @param classId the classId to set
	 */
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	

}
