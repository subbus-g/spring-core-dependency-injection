package setter_dependency_injection;

public class Teacher
{
    public static void main(String[] args) 
    {
        Student ram = new Student();
        ram.setId(1);
        ram.setFirstName("ram");
        ram.setLastName("johnson");
        System.out.println(ram);
    }
}