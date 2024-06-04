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
         	applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
         	
         	Employee employee=(Employee)applicationContext.getBean("employee");
         	System.out.println(employee);
         	
         	Address address=employee.getAddress();
         	System.out.println(address);
         }
         catch(Exception e)
         {
         	e.printStackTrace();
         }
        
    }
}
