package com.lp.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lp.po.Dept;
import com.lp.service.DeptService;
import com.lp.service.impl.DeptServiceImpl;
public class DeptTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml"); 
		DeptService deptService = (DeptServiceImpl)app.getBean("deptServiceImpl"); 
		Dept dept=new Dept();
		dept.setDeptName("young");
		dept.setId(3);
		Integer insertDept=deptService.updateAndInsert(dept); 
		System.out.println(insertDept);
		
		//Dept selectByPrimaryKey=(Dept) deptMapper.selectByPrimaryKey(1);
		//System.out.println(selectByPrimaryKey.getDeptName());
	}
}
