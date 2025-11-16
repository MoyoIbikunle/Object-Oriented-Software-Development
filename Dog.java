
//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025
class Dog extends Animal

{

    public Dog(String theType, int theAge, char theGender)
        {
            super(theType, theAge, theGender);
            
        }
    public void eat()
        {
            System.out.println( "Dog is eating");
        }
    
    public void sleep()
        {
            System.out.println( "Dog is sleeping");
        }

    public void makeSound()
        {
            System.out.println( "Woof woof!");
        }

    public String toString()
        {
            return super.toString();
        }
    
    
}