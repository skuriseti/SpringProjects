package com.srk.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
private static ApplicationContext context;

public static void main(String[] args) {  
	context = new ClassPathXmlApplicationContext(
			"applicationCOntext.xml");

    Student student= (Student) context.getBean("studentbean");  
    student.displayInfo();  
}  
}  