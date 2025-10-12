//Name: Moyo Ibikunle
//Student ID: C00309427
//Date: 12/10/2025

class testSavings{

    public static void main(String[] args) 
    {
         // Create two SavingsAccount objects (two separate bank accounts)
        SavingsAccount saver1 = new SavingsAccount();
         SavingsAccount saver2 = new SavingsAccount();
        // Set the starting balance for each account
         saver1.setBalance(2000);
         saver2.setBalance(3000);
         
         saver1.modIntRate(0.04);// Set the annual interest rate for all accounts to 4% 
         saver1.calculateMonthlyInterest();
         saver1.toString();
         saver1.modIntRate(0.05);
         saver1.toString();
    }
}