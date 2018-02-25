package com.biz.std.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import com.biz.std.model.Employee;
import com.biz.std.model.Student;

import java.util.Date;
import java.util.List;

//Repository是很重要的一个类，核心，定义一个接口，接口里面有一个方法，
//但是没有实现类，下面最终用的注解的方式，就可以不写继承,还是需要两个参数
@RepositoryDefinition(domainClass = Student.class, idClass = Integer.class)
public interface StudentRepository { //extends Repository<Employee这个是泛型,Integer这个是主键的ID>{
	//这个名字不能乱改，要按照规则来写findByName
    public Employee findByName(String name);

    // where name like ?% and age <?
    public List<Employee> findByNameStartingWithAndAgeLessThan(String name, Integer age);

    // where name like %? and age <?
    public List<Employee> findByNameEndingWithAndAgeLessThan(String name, Integer age);

    // where name in (?,?....) or age <?
    public List<Employee> findByNameInOrAgeLessThan(List<String> names, Integer age);

    // where name in (?,?....) and age <?
    public List<Employee> findByNameInAndAgeLessThan(List<String> names, Integer age);

    @Query("select o from Employee o where id=(select max(id) from Employee t1)")
    public Employee getEmployeeByMaxId();
    //使用占位符的方式，占位符要写序号
    @Query("select o from Student o where o.id=?1 ")
    public List<Student> queryParams1(Integer id);
    //使用命名参数的方式，要冒号，需要到参数那里写对应注解
    @Query("select o from Employee o where o.name=:name and o.age=:age")
    public List<Employee> queryParams2(@Param("name")String name, @Param("age")Integer age);
   
    @Query("select o from Employee o where o.name like %?1%")
    public List<Employee> queryLike1(String name);
    
    @Query("select o from Employee o where o.name like %:name%")
    public List<Employee> queryLike2(@Param("name")String name);
    //直接使用的数据库里面的表来查询，nativeQuery默认为false,需要手动设置为true来开启。本地查询
    @Query(nativeQuery = true, value = "select count(1) from employee")
    public long getCount();
    //需要更新表的时候，需要使用Modifying注解，而且在更新的时候还需要“事务”，写的时候都需要添加事务，写在Service里面
    @Modifying
    @Query("update Student o set o.age = :age,o.sex=:sex,o.name=:name where o.id = :id")
    public void modifyStudentsById(@Param("id")Integer id,@Param("sex")String sex, @Param("name")String name,@Param("age")Integer age);

	/**
	 * @param id
	 * @param name
	 */
    @Modifying
    @Query("update Student o set o.name=:name where o.id=:id")
	public void modifyStudentsById(@Param("id")Integer id,@Param("name")String name);

	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param age
	 * @param classes
	 * @param subject
	 */
  /*  @Modifying
    @Query("update Student o set o.age =?4,o.sex=?3,o.name=?2,o.classes=?5,o.subject=?6 where o.id =?1")
	public void modifyStudentsById(Integer id,String name,String sex,Date age,String classes, String subject);*/
  /*  @Modifying
    @Query("update Student o set o.age =:age,o.sex=:sex,o.name=:name,o.classes=:classes,o.subject=:subject where o.id =:id")
	public void modifyStudentsById(@Param("id")Integer id,@Param("name")String name,@Param("sex")String sex,@Param("age")Date age,@Param("classes")String classes, @Param("subject")String subject);
*/
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param sex
	 * @param subject
	 * @param classes
	 */
 
   /* @Query("insert into Student(id,name,age,sex,subject,classes) values(?1,?2,?3,?4?5,?6)")
	public void addStudent(Integer id, String name, String age, String sex, String subject, String classes);
*/


}
