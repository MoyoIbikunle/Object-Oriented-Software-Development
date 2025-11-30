//Name: Moyo Ibikunle
//Lab: 9
//Date: 29/11/2025
public class testVehicle {
    public static void main(String[] args) {
    ImportDuty[] vehicles= new ImportDuty[2];

    vehicles[0] = new Car ("SUV", 5, 5);
    vehicles[1] = new Hgv(5, 5, 2);
    
    
    for(int i = 0; i < vehicles.length; i++)
    {
        ImportDuty vehicle = vehicles[i];
        System.out.println(vehicle.toString());
        System.out.println("Duty: $"+ vehicle.calculateDuty());
    }
    
    }
        
    
}
