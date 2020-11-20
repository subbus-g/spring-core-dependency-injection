package constructor_dependency_injection;

public class Student 
{
    int id;
    String firstName;
    String lastName;
   
    Student(int id, String firstName, String lastName) 
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String toString() 
    {
        return "id:"+id+"\nfirstName:"+firstName+"\nlastName:"+lastName;
    }
}
