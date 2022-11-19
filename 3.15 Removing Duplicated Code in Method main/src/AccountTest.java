public class AccountTest{
    
    public static void main(String[] args){

        Account account1 = new Account("John", 1000);
        Account account2 = new Account("William", 2000);

        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Withdraw 50.0 from both accounts");

        account1.withdraw(50);
        account2.withdraw(50);

        displayAccount(account1);
        displayAccount(account2);

        System.out.println("Withdraw 1000.0 from both accounts");

        account1.withdraw(1000);
        account2.withdraw(1000);

        displayAccount(account1);
        displayAccount(account2);

    }

    public static void displayAccount(Account accountToDisplay) {
        
        System.out.printf("Balance of %s's account: %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}