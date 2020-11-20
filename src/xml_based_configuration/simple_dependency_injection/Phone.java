package simple_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Phone 
{
    public static void main(String[] args) 
    {
        // load the spring configaration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "simple_dependency_injection/config.xml");
        System.out.println("xml configuration is loaded successfully");

        // retrive the bean from spring container
        Sim sim = context.getBean("sim", Sim.class);

        // call the methods on the bean
        sim.call();
        sim.turnOnInternet();

        // close the context
        context.close();

    }
}
