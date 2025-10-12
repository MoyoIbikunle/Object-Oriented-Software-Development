//Name: Moyo Ibikunle
//Student ID: C00309427
//Date: 12/10/2025

// This class represents a bank customer who can hold up to three savings accounts
class BankCustomer{
    
        private String name;
        private String address;
        private int numOfAcc;   // Number of savings accounts the customer currently has
        private SavingsAccount accounts[] = new SavingsAccount [3];
    //initializes the customer's name and address
        public BankCustomer(String theName, String theAddress){
            name = theName;
            address = theAddress;
        }
  // Adds a SavingsAccount to the customer's list of accounts
        public void addAccount(SavingsAccount account ){
              // Check if the customer has fewer than 3 accounts
            if (numOfAcc < 3){
                // Add the new account to the array
                accounts[numOfAcc] = account;
                numOfAcc++;
            }
            else
                System.out.println("You cannot make more than 3 savings accounts");
            
         }
         // Calculates and returns the total balance across all of the customer's accounts
         public double balance()
         {
            double totalSav = 0;
            for (int i=0; i<numOfAcc; i++)
            {
                totalSav += accounts[i].getBalance();
            }
            return totalSav;
         }
            // Returns a string showing all account balances and the total
         public String toString(){

            String message = "";
            // Calculate total savings across all accounts
            double totalSav = balance();
            message += "Total Savings: " + totalSav + "\n";
            // Loop through all accounts and display their individual balances
            for (int i = 0; i < numOfAcc; i++) {
                message += "Account (" + i + "): Balance: " + accounts[i].getBalance(); 
            }

            return message;
         }

    
}