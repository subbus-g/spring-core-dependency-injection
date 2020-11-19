package simple_dependency_injection;

public class Airtel implements Sim
{

    @Override
    public void call() 
    {
        System.out.println("calling from Airtel");
    }

    @Override
    public void turnOnInternet() 
    {
        System.out.println("Internet is turning on from Airtel");
    }
    
    
}
