//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

//class to manage employees and offices
class MyHR{
    
    public static void addEmployee(Office [] office)//reminds me of int[] numbers = new int [];
          {
                Employee[] employee = new Employee[5];
                 // Loop to create and input details for each employee
                for (int index=0; index < 5; index++)
                    {
                        System.out.println("Enter details for employee " + (index + 1) + ":");
                        employee[index] = new Employee();//Creates a new Employee object in memory. Stores a reference to that object inside the ith slot of your employees array.

                        System.out.print("Is this employee a manager? (Yes/No): ");
                       // true = staff, false = manager
                        boolean isStaff;
                       String managerAnswer = EasyIn.getString();
                        if (managerAnswer.equalsIgnoreCase("Yes")) {
                        isStaff = false; // Yes = manager
                        } else {
                        isStaff = true;  // No = staff
                        }
                        // Set the employee type by calling empType (staff or manager)
                        employee[index].empType(isStaff);


                        
            // Get address
            System.out.print("Street: ");
            String street = EasyIn.getString();
            System.out.print("City: ");
            String city = EasyIn.getString();
            System.out.print("County: ");
            String county = EasyIn.getString();
            Address address = new Address(street, city, county);
            employee[index].setAddress(address);

            // If manager, get car details
            if (!isStaff) {
                System.out.print("Car Brand: ");
                String brand = EasyIn.getString();
                System.out.print("Car Model: ");
                String model = EasyIn.getString();
                System.out.print("Car Year: ");
                String year = EasyIn.getString();
                Car car = new Car(brand, model, year);
                employee[index].setCar(car);
            }

            // Assign employee to available office
                for( int j= 0; j<office.length; j++)
                    {
                        if(office[j].isEmpty()){
                        office[j].setEmployee(employee[index]); 
                        employee[index].setOffice(office[j]);
                         break;// Stop looking for offices once assigned, if not it could keep going and assign the same employee to all offcies.
                        }

                   
                    
                    }

                    // Print all employees
                for (int i = 0; i < employee.length; i++) {
                     // Check if the current slot in the array is not null,  because employee[i] is null for all slots not yet assigned,(all employees not created yet)
                if (employee[i] != null) {
                System.out.println(employee[i].toString());
                }
}

            
                    }
        }
    public static void main(String[] args) {
        // initialise  variables
        Office[] office = new Office [3];
        
       // Create 3 office objects
        for (int i = 0; i < office.length; i++) {
            office[i] = new Office();
        }

        // Call the addEmployee method
        addEmployee(office);
        // Print office summaries
        System.out.println("\n--- Office Summaries ---");
        for(int j=0; j<office.length;j++)
        {
            System.out.println(office[j].toString());
        }

   
}




          
}



       /*  create employees template
        for (int index = 0; index < MAX_EMPLOYEES; index++ )
        {
            Employee employee = new Employee();
            Address address;// = new Address("Old Street", "Bagenasltown", "Carlow");
            
            // initialise a new employee


            // try to assign employee to office
            for (int j = 0; j < office.length; j++ )
            {
                // check if office has space
                if ()
                {
                    office[j].setEmployee(employee);
                    // assign office to employee
                    // then break
                    break;
                }
            }
        }*/