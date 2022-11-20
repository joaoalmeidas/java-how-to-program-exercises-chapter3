# java-how-to-program-exercises-chapter3
Exercises resolutions from the chapter 3 from the book Java - How to program

3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw.

3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
about the petrol you purchase. The class should include five pieces of information in the form of instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
(double). Your class should have a constructor that initializes the five instance variables. Provide a
set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.

3.13 (Car Class) Create a class called Car that includes three instance variables—a model (type
String), a year (type String), and a price (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the
price of the first car and a 7% discount on the price of the second. Display each Car’s price again.

3.14 (Clock Class) Create a class called Clock that includes three instance variables—an hour
(type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
three instance variables and assumes that the values provided are correct. Provide a set and a get
method for each instance variable. The set method should set the value of all three variables to 0 if
the value of hour is more than 23, the value of minute is more than 59, and the value of second is
more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
a test app named ClockTest that demonstrates class Clock’s capabilities.

3.15 (Removing Duplicated Code in Method main) In the AccountTest class of Fig. 3.9, method
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

3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
that your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. Your target
heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes
for the month, day and year of birth). Your class should have a constructor that receives this data as
parameters. For each attribute provide set and get methods. The class also should include a method
that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum heart rate and targetheart-rate range.

3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
the computerization of health records. This possibility is being approached cautiously because of
sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
Computerizing health records could make it easier for patients to share their health profiles and histories among their various health-care professionals. This could improve the quality of health care,
help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart from Exercise 2.33.
