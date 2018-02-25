package com.biz.std.controller;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biz.std.model.Employee;
import com.biz.std.model.Student;
import com.biz.std.service.CategoryService;
import com.biz.std.util.Page;
import com.biz.std.vo.Category;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		//PageHelper.offsetPage(page.getStart(),5);
		List<Employee> cs= categoryService.lista();
		/*int total = (int) new PageInfo<>(cs).getTotal();*/
		
		/*page.caculateLast(cs)*/;
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping("save")
	public String save(Page page){
		Employee employye=new Employee();
		employye.setAge(66);
		employye.setName("田野");
		categoryService.save(employye);
		return "studentsAdd";
	}
	@RequestMapping("delStudent")
	public ModelAndView delStudent(Integer id){
		categoryService.delStudentById(id);
		ModelAndView mav=new ModelAndView();
		List<Student> stu=categoryService.listAllStudent();
		System.out.println(stu);
		mav.addObject("list", stu);
		mav.setViewName("studentsManage");		
		return mav;
	}
	@RequestMapping("studentsManage")
	public ModelAndView listStu(HttpServletRequest request,HttpServletResponse response ){
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		ModelAndView mav=new ModelAndView();
		List<Student> stu=categoryService.listAllStudent();
		System.out.println(stu);
		mav.addObject("list", stu);
		mav.setViewName("studentsManage");	
		return mav;
		
	}
	/**
	 * 延迟加载错误
	 * @param request
	 * @param response
	 * @param id
	 * @return
	 */
	@RequestMapping("GetStudentsById")
	public ModelAndView GetStudentsById(HttpServletRequest request,HttpServletResponse response,Integer id){
		ModelAndView mav=new ModelAndView();
		List<Student> stu=categoryService.GetStudentsById(id);
		mav.addObject("list", stu);
		mav.setViewName("getStudent");
		System.out.println("stu  :"+stu);
		return mav;
		
	}
	@RequestMapping("studentModify")
	public ModelAndView modifyStudentsById(HttpServletRequest request,HttpServletResponse response,Integer id,String name,String sex,Date age,String classes,String subject[]){
		ModelAndView mav=new ModelAndView();
		List<Student> stu=categoryService.listAllStudent();
		mav.addObject("list", stu);
		mav.setViewName("studentsManage");
		return mav;
		
	}
	@RequestMapping("addStudent")
	public ModelAndView addStudent(){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("studentsAdd");
		return mav;
	}
	/**
	 * 400错误，参数不对
	 * @param request
	 * @param response
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("addStudentFinal")
	public ModelAndView addStudentFinal(HttpServletRequest request,HttpServletResponse response,Integer id,String name,@RequestParam(value = "sex", required = false) String sex/*,String sex,,String classes,String subject[]*/){
		ModelAndView mav=new ModelAndView();
		System.out.println("id :"+id+"name :"+name);
		String classes=request.getParameter("classes");
		System.out.println("classes :"+classes);
		String sex1=request.getParameter("sex");
		System.out.println("sex :"+sex);
		String age1=request.getParameter("age");								 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    java.util.Date age=null;
		try {
			age =  sdf.parse(age1);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		String subject= request.getParameter("subject");
		System.out.println("subject :"+subject);
		//一直为空
		sex="女";
		//一直为空
		subject="语文";
		Student student=new Student(id, name, age, sex, classes, subject);
		categoryService.addStudent(student);
		List<Student> stu=categoryService.listAllStudent();
		System.out.println(stu);
		mav.addObject("list", stu);
		mav.setViewName("studentsManage");
		System.out.println(stu);		
		return mav;
		
	}
}
