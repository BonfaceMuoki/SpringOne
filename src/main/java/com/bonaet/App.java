package com.bonaet;

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
        //FormOne fone = new FormOne();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        FormOne fone =(FormOne) context.getBean("f_one");
        fone.printFormLabel();
        System.out.println( "Hello World!" );
    }
}
