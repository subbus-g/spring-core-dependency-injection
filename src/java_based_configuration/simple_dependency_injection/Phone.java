
package simple_dependency_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Phone 
{
    public static void main(String[] args) 
    {
        // load the spring configaration java file
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext(Config.class);
        

        // retrive the bean from spring container
        Sim sim = context.getBean("sim", Sim.class);

        // call the methods on the bean
        sim.call();
        sim.turnOnInternet();

        // close the context
        context.close();

    }
}
