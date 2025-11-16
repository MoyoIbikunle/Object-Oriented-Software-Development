//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025
public class Animal
{
    private String type;
    private int age;
    private char gender;

    public Animal(String theType, int theAge, char theGender)
        {
            type = theType;
            age = theAge;
            gender = theGender;
        }

    public void setType (String theType)
        {
            type = theType;
        }

    public String getType ()
        {
            return type;
        }

    public void setAge (int theAge)
        {
            age = theAge;
        }

    public int getAge ()
        {
            return age;
        }

    public void setGender (char theGender)
        {
             gender = theGender;
        }

    public char getGender ()
        {
            return gender;
        }

    public void eat()
        {
            System.out.println( "Animal is eating");
        }

    public void sleep()
        {
            System.out.println( "Animal is sleeping");
        }

    public void makeSound()
        {
            System.out.println( "A generic animal sound");
        }

    public String toString()
        {
            return "Type: " + type  + ", " + "Age: " +age + ", " + "Gender: " + gender;
        }














}