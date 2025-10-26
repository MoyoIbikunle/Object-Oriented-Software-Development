//Name: Moyo Ibikunle
//Student ID: C000309427
//Lab: 4
//Date: 22/10/2025

// Class to store a manager's car details
class Car{
    private String carBrand;
    private String carModel;
    private String carYear;

// Constructor: initializes the car
    public Car(String theBrand, String theModel, String theYear){

        carBrand = theBrand;
        carModel = theModel;
        carYear = theYear;
    }

    public void setCarBrand(String theBrand) {
        carBrand = theBrand;
    }

    public void setCarYear(String theYear) {
        carYear = theYear;
    }

    public void setCarModel(String theModel) {
        carModel = theModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarYear() {
        return carYear;
    }

    public String getCarModel() {
        return carModel;
    }
// toString method: returns the car details 
    public String toString(){

       return  getCarBrand() + " " + getCarYear() + " "+ getCarModel() + " ";
        
    }
    



}