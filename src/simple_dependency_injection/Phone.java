package simple_dependency_injection;
public class Phone 
{
    public static void main(String[] args) 
    {
        Sim sim = new Airtel();
        sim.call();
        sim.turnOnInternet();

        sim = new Jio();
        sim.call();
        sim.turnOnInternet();
    }
}
