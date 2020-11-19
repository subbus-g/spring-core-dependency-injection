package simple_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Phone 
{
    public static void main(String[] args) 
    {
        //load the spring configaration file
        ApplicationContext context = new ClassPathXmlApplicationContext("./simple_dependency_injection/config.xml");
        System.out.println("xml configuration is loaded successfully");

        Sim sim = new Airtel();
        sim.call();
        sim.turnOnInternet();

        sim = new Jio();
        sim.call();
        sim.turnOnInternet();

    }
}
