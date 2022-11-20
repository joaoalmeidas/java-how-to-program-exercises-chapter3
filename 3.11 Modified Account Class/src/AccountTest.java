public class AccountTest{
    
    public static void main(String[] args){
    	
    	/*
    	 * 	3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
			the Account’s balance. If it does, the balance should be left unchanged and the method should print
			a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
			(Fig. 3.9) to test method withdraw.
    	 */

        Account account1 = new Account("John", 1000);
        Account account2 = new Account("William", 2000);

        System.out.printf("Balance of account1 before withdraw: %.2f%n", account1.getBalance());
        System.out.printf("Balance of account2 before withdraw: %.2f%n", account2.getBalance());

        System.out.println("Withdraw 50.0 from both accounts");

        account1.withdraw(50);
        account2.withdraw(50);

        System.out.printf("Balance of account1: %.2f%n", account1.getBalance());
        System.out.printf("Balance of account2: %.2f%n", account2.getBalance());

        System.out.println("Withdraw 1000.0 from both accounts");

        account1.withdraw(1000);
        account2.withdraw(1000);

        System.out.printf("Balance of account1: %.2f%n", account1.getBalance());
        System.out.printf("Balance of account2: %.2f%n", account2.getBalance());

    }   
}