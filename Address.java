//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

// Class to store an employee's address details
class Address{
    private String street;
    private String city;
    private String county;
// Constructor that initializes the address 
    public Address(String theStreet, String theCity, String theCounty){
        street = theStreet;
        city = theCity;
        county = theCounty;
    }
    
    // Setter for street
    public void setStreet(String theStreet){
         street = theStreet;
    }

    // Setter for city
    public void setCity(String theCity){
        city = theCity;
    }

    // Setter for county
    public void setCounty(String theCounty){
        county = theCounty;
    }
// Getter for street
    public String getStreet(){
         return street;
    }
// Getter for city
     public String getCity(){
        return city;
    }
// Getter for county
     public String getCounty(){
        return county;
    }

    // toString method: returns the full address
    public String toString(){
        String message;
        message = getStreet() + ", "+ getCity() + ", "+ getCounty();
        return message;
    }

    

}