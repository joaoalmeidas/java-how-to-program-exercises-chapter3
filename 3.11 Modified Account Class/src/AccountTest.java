public class AccountTest{
    
    public static void main(String[] args){

        Account account1 = new Account("John", 1000);
        Account account2 = new Account("William", 2000);

        account1.withdraw(50);
        account2.withdraw(78);

        System.out.printf("Balance of account1: %f/n", account1.getBalance());
        System.out.printf("Balance of account2: %f/n", account2.getBalance());
    }   
}