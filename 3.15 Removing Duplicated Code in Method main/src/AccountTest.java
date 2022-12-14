public class AccountTest{
    
    public static void main(String[] args){
    	
    	/*
    	 * 	3.15 (Removing Duplicated Code in Method main) In the AccountTest class of Fig. 3.9, method
			main contains six statements (lines 11–12, 13–14, 26–27, 28–29, 38–39 and 40–41) that each display an Account object’s name and balance. Study these statements and you’ll notice that they differ
			only in the Account object being manipulated—account1 or account2. In this exercise, you’ll define
			a new displayAccount method that contains one copy of that output statement. The method’s parameter will be an Account object and the method will output the object’s name and balance. You’ll
			then replace the six duplicated statements in main with calls to displayAccount, passing as an argument the specific Account object to output.
			Modify class AccountTest of Fig. 3.9 to declare method displayAccount (Fig. 3.20) after the
			closing right brace of main and before the closing right brace of class AccountTest. Replace the comment in the method’s body with a statement that displays accountToDisplay’s name and balance.
			Recall that main is a static method, so it can be called without first creating an object of the
			class in which main is declared. We also declared method displayAccount as a static method.
			When main needs to call another method in the same class without first creating an object of that
			class, the other method also must be declared static.
			Once you’ve completed displayAccount’s declaration, modify main to replace the statements
			that display each Account’s name and balance with calls to displayAccount—each receiving as its
			argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest
			class to ensure that it produces the same output as shown in Fig. 3.9.
    	 */

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