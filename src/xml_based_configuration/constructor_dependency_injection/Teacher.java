package constructor_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher
{
    public static void main(String[] args) 
    {
        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("constructor_dependency_injection/config.xml");
        Student ram = context.getBean("student", Student.class);
        System.out.println(ram);
        context.close();
    }
}