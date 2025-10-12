// Driver program to test the BankCustomer and SavingsAccount classes

class BankCustomerTest {
    public static void main(String[] args) {
        
        // Create two bank customers
        BankCustomer customer1 = new BankCustomer("Moyo Ibikunle", "12 Apple Street, Dublin");
       
        // Savings accounts for each customer
        SavingsAccount acc1 = new SavingsAccount();
        SavingsAccount acc2 = new SavingsAccount();
        SavingsAccount acc3 = new SavingsAccount();

        // Set initial balances
        acc1.setBalance(2000);
        acc2.setBalance(1500);
        acc3.setBalance(3000);
     

        // Set a shared annual interest rate for all accounts
        SavingsAccount.modIntRate(0.04);

        // Add accounts to each customer 
        customer1.addAccount(acc1);
        customer1.addAccount(acc2);
        customer1.addAccount(acc3);


        // Calculate monthly interest for each account
        acc1.calculateMonthlyInterest();
        acc2.calculateMonthlyInterest();
        acc3.calculateMonthlyInterest();

        // Print details for customer 1
        System.out.println("Customer 1 Details");
        System.out.println("Name: Moyo Ibikunle");
        System.out.println("Address: 12 Apple Street, Dublin");
        System.out.println(customer1.toString()); // Shows all balances and total savings


        // Change the interest rate to 5% and apply again
        SavingsAccount.modIntRate(0.05);

        acc1.calculateMonthlyInterest();
        acc2.calculateMonthlyInterest();
        acc3.calculateMonthlyInterest();
    

        System.out.println();
        System.out.println("Post Interest Rate Change 5% ");
        System.out.println("Customer 1 total savings: " + customer1.balance());
    
    }
}
