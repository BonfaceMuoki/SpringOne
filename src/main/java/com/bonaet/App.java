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
        SchoolForm form;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        form = (SchoolForm) context.getBean("f_one");
        // fone.printFormLabel();
        form.printFormLabel();
        System.out.println( "Hello World!" );
    }
}
