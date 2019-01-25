package com.srk.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class QuestionTest {  
private static ApplicationContext context;

public static void main(String[] args) {  
	context = new ClassPathXmlApplicationContext(
			"applicationContextQuestion.xml");

    Question quest = (Question) context.getBean("qbean");  
    quest.displayInfo();  
}  
}  