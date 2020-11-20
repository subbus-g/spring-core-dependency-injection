package setter_dependency_injection;

public class Student 
{
    int id;
    String firstName;
    String lastName;
   
    public void setId(int id)
    {
        this.id = id;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String toString() 
    {
        return "id:" + id + "\nfirstName:" + firstName + "\nlastName:" + lastName;
    }
}
