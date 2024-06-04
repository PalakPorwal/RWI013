package com.palak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext applicationContext=null;
     	
     	try {
     		applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
     		Object object=applicationContext.getBean("message");
     		Message message=(Message)object;

     		 System.out.println(message.getMessageId()+"\t"+message.getMessage());
     	       
     	}
     	catch(Exception e)
     	{
     		e.printStackTrace();
     	}
    }
}
