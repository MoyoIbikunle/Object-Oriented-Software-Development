//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;
  
	public Hgv(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	

        public double calculateDuty()
    {
        return HGVTAXRATE*cargo;
    }

    public String toString() {
    return "HGV, Wheels: " + getWheels() + ", Passengers: " + getPass() + ", Cargo: " + getCargo();
}
}