//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

class Cat extends Animal

{

    public Cat(String theType, int theAge, char theGender)
        {
            super(theType, theAge, theGender);
            
        }

     public void eat()
        {
            System.out.println( "Cat is eating");
        }
    
    public void sleep()
        {
            System.out.println( "Cat is sleeping");
        }

    public void makeSound()
        {
            System.out.println( "Meow!");
        }


    public String toString()
        {
            return super.toString();
        }
    
    
}