/*Name: Moyo Ibikunle */
/*Student ID: C00309427 */
/*Date: 04/10/2025 */
class Rooms{

    public static void main(String[] args)
    {
         // Creates a new HotelRoom object roomA using the no-argument constructor
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200); // Set room number to 200
        roomA.setRoomType("Single"); // Set room type to "Single"
        roomA.setoccState(1); // Set occupancy state: 1 = occupied
        roomA.setRate(100); // Set nightly rate to 100
        System.out.println("Room A number is " + roomA.getRoomNumber() + ", its a " + roomA.getRoomType() + " room, the state is " + roomA.getOccState() + ", which means occupied, and the rate per night is " + roomA.getRate());  // Print roomA details using getter methods
        HotelRoom roomB = new HotelRoom(); // Creates a new HotelRoom object for roomB using the no-argument constructor
        roomB.setRoomNumber(201); // Set room number to 201
        roomB.setRoomType("Double"); // Set room type to "Double"
        roomB.setoccState(0); // Set occupancy state: 0 = vacant
        roomB.setRate(80);// Set nightly rate to 80
        if(roomB.isOccupied())
        {
             System.out.println("Cannot book roomB: already occupied!");
        }
        else{
            roomB.setOccupied(1);
        }
          
        
        System.out.println("Room B's number is " + roomB.getRoomNumber() + ", its a " + roomB.getRoomType() +" room, the state is " + roomB.getOccState() + " which means occupied, and the rate per night is " + roomB.getRate());  // Print roomB details using getter methods
        HotelRoom roomC = new HotelRoom(202, "Single", 0,90);// Create a new HotelRoom object for roomC using the constructor with parameters
        
        

        

    }
}