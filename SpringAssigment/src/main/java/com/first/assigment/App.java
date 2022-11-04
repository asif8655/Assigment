package com.first.assigment;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.assigment.entity.Collage;
import com.first.assigment.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger logger= Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	logger.info("Main method Started");
		logger.warn("Context is open");
    	Student student = context.getBean(Student.class);
    	System.out.println(student);
    	logger.info(student);
    	Collage collage = context.getBean(Collage.class);
    	System.out.println(collage);
    	logger.info(collage);
    	
    	
    }
}
