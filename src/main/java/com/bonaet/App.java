package com.bonaet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        School school;
        SchoolForm form;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        school = (School) context.getBean("school");
        form = (SchoolForm) context.getBean("f_two");
        form.setLabel("Overwritten Form Two");
        school.setForm(form);
        school.getForm().printFormLabel();
        System.out.println("Hello World!");
    }
}
