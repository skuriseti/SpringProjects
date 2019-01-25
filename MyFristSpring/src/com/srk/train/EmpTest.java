package com.srk.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class EmpTest {  
private static ApplicationContext context;

public static void main(String[] args) {  
	context = new ClassPathXmlApplicationContext(
			"applicationContextemployee.xml");

    Employee emp = (Employee) context.getBean("employeebean2");  
    emp.show();  
    System.out.println("Program is done");
}  
}  