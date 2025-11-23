//Name : Moyo Ibikunle
//Date: 21/11/2025
//Lab: Lab 8
public class TestPerson
{
    public static void main(String[] args) 
    {
        Person[] people = new Person [2];
        

        people[0] = new Employee("Cheryl", 45000);
        people[1] = new Student("Joe", "Engineering");

        System.out.println(people[0].getName() + people[0].getDescription());
        System.out.println(people[1].getName() + people[1].getDescription());
    }
    

}