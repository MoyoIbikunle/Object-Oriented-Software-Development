/*Name: Moyo Ibikunle */
/*Student ID: C00309427 */
/*Date: 04/10/2025 */
 class HotelRoom
{
    // Private instance variables
    private int roomNumber; // the room's number
    private String roomType; // type of the room ("Single" or "Double")
    private int occState; // occupancy state: 0 = vacant, 1 = occupied
    private double rate; // nightly rate of the room
    
    
    //constructor with no argument
    public HotelRoom(){
      
    }
    
    // Constructor with parameters to instantiate all instance variables
    public HotelRoom( int number, String type, int theState, double theRate){
        roomNumber = number;
        roomType = type;
        occState = theState;
        rate = theRate;
    }

     // Setter method for roomNumber
    public void setRoomNumber(int number){
        roomNumber = number;
    } 

    // Setter method for roomType
    public void setRoomType(String type){
        roomType = type;
    } 

    // Getter method for roomNumber
    public int getRoomNumber(){
        return roomNumber;
    }

    // Getter method for roomType
    public String getRoomType(){
        return roomType;
    }

    // Setter method for occupancy state
    public void setoccState(int theState)
    {
        occState = theState;

    }

    // Getter method for occupancy state
    public int getOccState(){
        return occState;
    }

    // Setter method for rate
    public void setRate(double theRate)
    {
        rate = theRate;

    }

    // Getter method for rate
    public double getRate(){
        return rate;
    }

    public void setOccupied ( int theState)
     {
        occState = theState;
    }

    public boolean isOccupied() {
        if (occState == 1) {
            return true;  // room is occupied
        } else {
            return false; // room is vacant
        }

    

    }
    

   
   
   
        

  

     

    }