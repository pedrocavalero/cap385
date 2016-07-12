package com.pedrocavalero.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pedrocavalero.spring.aspect.UsageTracked;
import com.pedrocavalero.spring.service.CustomerService;
import com.pedrocavalero.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("Pedro Cavaléro");
		
//		UsageTracked usageTracked = ctx.getBean("employeeService", UsageTracked.class);
//		System.out.println(usageTracked.getCount());

//		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
//		System.out.println(customerService.getCustomer().getName());
		//employeeService.getEmployee().throwException();

		
		ctx.close();
	}

}
