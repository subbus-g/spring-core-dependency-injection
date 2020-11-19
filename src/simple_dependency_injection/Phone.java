package simple_dependency_injection;
public class Phone 
{
    public static void main(String[] args) 
    {
        Airtel airtel = new Airtel();
        airtel.call();
        airtel.turnOnInternet();

        Jio jio = new Jio();
        jio.call();
        jio.turnOnInternet();
    }
}
