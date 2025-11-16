
//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025
class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

        Vet vet = new Vet("Moyo Ibikunle", 18, 'F');
		System.out.println(vet);
		System.out.println();
        vet.vaccinate(dog);
		System.out.println();
        vet.vaccinate(cat);


		}
}