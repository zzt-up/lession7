/**  
* <p>Title: StudentAndSubject.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author shenlan  
* @date 2018年2月25日  
* @version 1.0  
*/ 
package com.biz.std.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author zzt
 * 2018年2月25日
 * Description: 
 */
@Entity
public class StudentAndSubject {
	


	
	private Integer StudentId;
	
	private Integer SubjectId;
	@Id
	private Integer stuAndSubId;
	/**
	 * @return the stuAndSubId
	 */
	public Integer getStuAndSubId() {
		return stuAndSubId;
	}
	/**
	 * @param stuAndSubId the stuAndSubId to set
	 */
	public void setStuAndSubId(Integer stuAndSubId) {
		this.stuAndSubId = stuAndSubId;
	}

	private Integer Score;
	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return StudentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}
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
	 * @return the score
	 */
	public Integer getScore() {
		return Score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		Score = score;
	}
	
}
