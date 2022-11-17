public class AccountTest{
    
    public static void main(String[] args){

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