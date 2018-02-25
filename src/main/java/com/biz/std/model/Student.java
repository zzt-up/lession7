package com.biz.std.model;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student实体类
 */
@Entity
public class Student {

    /**
     * 主键字段
     */
	 @GeneratedValue
	 @Id
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Date  age;
    private String sex;
    /**
	 * @return the sex
	 */
    private String Classes;
    private String Subject;
    
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param sex
	 * @param classes
	 * @param subject
	 */
	public Student(int id, String name, Date age, String sex, String classes, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		Classes = classes;
		Subject = subject;
	}

	/**
	 * 
	 */
	public Student() {
		super();
	}

	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}



	/**
	 * @return the subject
	 */
	public String getSubject() {
		return Subject;
	}

	/**
	 * @return the classes
	 */
	public String getClasses() {
		return Classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(String classes) {
		Classes = classes;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		Subject = subject;
	}

	
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }
}
