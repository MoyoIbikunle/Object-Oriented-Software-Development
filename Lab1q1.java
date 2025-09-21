// Student Name 	: Moyo Ibikunle
// Student Id Number: 
// Date 			: Sept-2024
// Purpose 			: My first class implementation

public class ThermTest
{ // begin class ThermTest

	public static void main(String args[]) 
	{ // being main method
         double tempB;
        

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
        Thermometer thermB = new Thermometer(10.0);		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		tempB = thermB.getCelsius();

        System.out.println("Temp. of Thermometer B is " + tempB);
	} // end main
} // end class ThermTest