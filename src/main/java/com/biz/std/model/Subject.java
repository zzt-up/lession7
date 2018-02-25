/**  
* <p>Title: Subject.java</p>  
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
public class Subject {
	 @GeneratedValue
	 @Id
	private Integer SubjectId;
	private String SubjectName;
	/**
	 * @return the subjectId
	 */
	public Integer getSubjectId() {
		return SubjectId;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(Integer subjectId) {
		SubjectId = subjectId;
	}
	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return SubjectName;
	}
	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	
}
