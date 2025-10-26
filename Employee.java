//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

class Employee {
     // Unique employee number
    private int empNum;
    // Static variable to track the next employee number
    private static int nextNum = 1000;
     // Boolean, true if staff, false if manager
    private boolean isStaff;
    //Car object 
    Car car;
    //address object 
    private Address address;
    //office object 
    private Office office;
   
        // Constructor that assigns a unique employee number automatically
    public Employee(){
        empNum = nextNum;
        nextNum++;
    }

    //  method to get the next employee number
    public static int getNumOfEmp()
    {
       return nextNum;
    }
    public void setAddress(Address homeAddress){
        address = homeAddress;
    }

    public void setOffice(Office assignedOffice){
        office = assignedOffice;
    }

    public void setCar(Car carDetails){
        car = carDetails;
    }

    public Address getAddress(){
        return address; 
    }

    public Office getOffice(){
        return office;
    }

     public Car getCar(){
        return car; 
    }
     // method to get the number of employee records created
     public static int getNumOfEmpRecs()
    {
       return nextNum-1000;
    }
     // Sets the employee type (staff or manager)
    public void empType(boolean theType){
        isStaff = theType;

       
    }

    public String toString()
    {
         // toString method: returns a string with employee details
        String message = "The employee number is " + empNum +"\n";
        
        
          if(isStaff){
        // If the employee is staff
         message += "This employees address and office is : \n"+ getAddress() + "\n" + getOffice() +"\n";
        message+= "The number of employee records is" + getNumOfEmpRecs();
        }
        else {
             // If the employee is a manager
            message+=" This employees car details are: " + getCar()+ "." ;
            System.out.println();
        message += "This employees address and office is : "+ getAddress() + " " + getOffice() +".";
        message+= "The number of employee records is " + " "+ getNumOfEmpRecs();
       
            } 
           return message;
       
        }
       
 
} 
    


