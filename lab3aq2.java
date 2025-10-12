//Name: Moyo Ibikunle
//Student ID: C00309427
//Date: 12/10/2025
class SavingsAccount{

    private int uniqNum = 0;// Unique number for each account 
    private static int nextNum= 1;// Static variable shared by all accounts to keep track of the next unique number
    private static double intRate;    // Static interest rate shared across all accounts
    private double savingsBalance;
    private double monthlyInterest;

  
    public SavingsAccount(){
   
        uniqNum = nextNum;  // assign value
        nextNum++;  //increment for the next object
    }


    // Sets the account's balance
    public void setBalance(double theBalance){
        savingsBalance = theBalance;
    }
    // Returns the current account balance
    public double getBalance(){
       return savingsBalance;
    }
    
 // Returns the current interest rate
     public double getRate(){
       return intRate; 
    }

    // Calculates and adds the monthly interest to the balance

    public void calculateMonthlyInterest()
    {
        monthlyInterest = ((savingsBalance*intRate)/12);
        savingsBalance =  savingsBalance + monthlyInterest;
        

    }
// Static method to modify the interest rate for all accounts
    public static void modIntRate(double newVal){
        intRate = newVal;
    }
 // Returns a string of the account’s current state
    public String toString(){
      return "The balance is " + getBalance()
         + ". The monthly interest is " + monthlyInterest
         + " and the interest rate is " + intRate + ".";  }


        

}
