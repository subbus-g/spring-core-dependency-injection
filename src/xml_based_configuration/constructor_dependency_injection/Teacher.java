package constructor_dependency_injection;

public class Teacher
{
    public static void main(String[] args) 
    {
        Student ram = new Student(1,"ram","vastava");
        System.out.println(ram);
    }
}