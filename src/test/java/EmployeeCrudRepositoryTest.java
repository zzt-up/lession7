


import com.biz.std.model.Employee;
import com.biz.std.service.CategoryService;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCrudRepositoryTest {


	//上下文对象
    private ApplicationContext ctx = null;
    //继承了repository的接口EmployeeRepository
    private CategoryService categoryService = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        categoryService = ctx.getBean("categoryService",CategoryService.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }
    @Test
    public void testSave(){
    	List<Employee> employees=new ArrayList<Employee>();
    	Employee employee =null;
    	for(int i=0;i<100;i++){
    		employee =new Employee();
    		employee.setName("test"+i);
    		employee.setAge(100-i);
    		employees.add(employee);    	
    	}
    	
              
    	System.out.println(categoryService.lista()+"----");

    }

}
