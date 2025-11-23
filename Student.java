//Name : Moyo Ibikunle
//Date: 21/11/2025
//Lab: Lab 8
public class Student extends Person
{

    private String course;

    public Student (String name, String course)
       {
            super(name);
            this.course = course;
       }

    public String getDescription()
       {
            return " a student studying " + course +".";
       }
           
        
}