package simple_dependency_injection;

public class Jio implements Sim
{

    @Override
    public void call() 
    {
        System.out.println("calling from Jio");
    }

    @Override
    public void turnOnInternet() 
    {
        System.out.println("Internet is turning on from Jio");
    }
    
    
}
