package com.palak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.palak.config.MySpringConfig;

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
     		applicationContext=new AnnotationConfigApplicationContext(MySpringConfig.class);
     		Object object=applicationContext.getBean("message");
     		
     		Message message=(Message)object;
     		message.setMessageId(101);
     		message.setMessage("hello");
     		
     		
     		 System.out.println(message.getMessageId()+"\t"+message.getMessage());
     	       
     	}
     	catch(Exception e)
     	{
     		e.printStackTrace();
     	}
    }
}
