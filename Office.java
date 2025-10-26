//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

// Class to represent an office in the company
class Office{
     // variable to automatically assign room numbers starting from 100
    private static int newNum = 100;
    private int roomNum;
    private int numOfAcc;
    private int numOfEmployees = 0;  
    // Array that stores up to 2 employees per office
    private Employee employees [] = new Employee [2];

    
    // Constructor that assigns a room number automatically
    public Office()
    {
        roomNum = newNum; 
        newNum++; // Increment static counter for the next office
    }

    // Method to assign an employee to this office
    public boolean setEmployee( Employee employee)
    {
     
       
        if(numOfEmployees<2)
        {
            employees[numOfEmployees] = employee;
            numOfEmployees++;  
            return true;//added
        }
        else {
            return false; // Office full
        }


        
    }
  // Method to check if the office has space for more employees
    public boolean isEmpty(){
        return numOfEmployees < 2;// True if less than 2 employees
    }

    

    public String toString()
    {

        String message;
        // If office has 1 or 2 employees
    if (numOfEmployees == 1 || numOfEmployees == 2 ) {
            message = "Employees assigned.\n";
        }
    else {
        message = " No Employees assigned.\\n";
                       
    }
    return message;
}
}
