//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

class Vet extends Animal
{
    private String name;

    public Vet(String theName, int theAge, char theGender)
        {
            super("Vet",theAge, theGender);
            name = theName;
        }
    
     public String getName()
        {
            return name;
        }

    public void vaccinate(Animal animal)
        {
            System.out.println(name + " is vaccinating.");

            if (animal instanceof Dog)
                {
                    System.out.println("Dog has been vaccinated. ");
                    System.out.println(animal.toString());
                }

            if (animal instanceof Cat)
                {
                    System.out.println("Cat has been vaccinated. ");
                    System.out.println(animal.toString());
                }
  



        }


    
}