package com.atguigu.team.junit;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;

/**
 * 项目名称 ： Project03
 * 类名称 ： NameListServiceTest
 * 类描述 ：
 * 创建人 ： PanYuHan
 * 创建时间 ： 2019年12月25日上午10:41:34
 * @version
 */
public class NameListServiceTest {
	
	@Test
	public void testGetAllEmployees() {
		NameListService service= new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0;i < employees.length;i++) {
			System.out.println(employees[i].toString());
		}
	}

	@Test
	public void testGetEmpoyee() {
		NameListService service= new NameListService();
		int id = 1;
		
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}



}	