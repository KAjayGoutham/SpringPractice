package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        String path  = "src/SpringTool.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        Vehicle v = (Vehicle) context.getBean("car");
        v.drive();

    }
}
