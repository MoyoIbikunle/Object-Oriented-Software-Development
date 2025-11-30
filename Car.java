//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class Car extends RoadVehicle implements ImportDuty{
	private String carType; 
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}

    public double calculateDuty()
    {
        return CARTAXRATE*getPass();
    }
 
	public String getType() {
		return carType;
	}

    public String toString() {
    return "Car type: " + getType() + ", Wheels: " + getWheels() + ", Passengers: " + getPass();
        }

    
}