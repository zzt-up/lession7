package com.biz.std.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 雇员:  先开发实体类===>自动生成数据表
 */
//此注解告诉前面那个自动生成表的那个语句，检测数据库里面有没有对应的表，没有就自动生成
@Entity
/*@Table(name="test_employee")*/
//@table,默认是在数据库中创建一个employee表，为了避免与之前冲突，使用此注解之后就生成一个test_employee的表
public class Employee {

    private Integer id;

    private String name;
    private Integer age;
    //这个是ID，而且是自增的
    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setId(Integer id) {
        this.id = id;
    }
    //设置此列的长度，还可以设置Colum的其它属性
    @Column(length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
