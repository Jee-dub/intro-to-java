import java.util.Scanner;

/**
 * Contributor(s): 
 * Giovanni Williams; 0005737179
 * Alma Hurtado; 0005755369
 * Monika Ortiz, 0005780043
 * Robert Lopez, 0005726815
 * 
 * Sources:
 * Starting Out with Java, 6th edition, T. Gaddis
 * http://MyProgrammingLab.com: Starting Out with Java, 6th edition
 * 
 * Version: August 31, 2019
 */

//Ask for amount of purchase, display total of state and county tax then total purchase cost.

public class SalesTaxCalculator
{
    public static void main()
    {
        //Initializing constant double STATE_TAX to hold value of 0.04. 
        final double STATE_TAX = 0.04;
        
        //Initializing constant double COUNTY_TAX to hold value of 0.02.
        final double COUNTY_TAX = 0.02;
        
        //Declaring doubles to hold purchaseAmount, totalAmount, and totalPurchaseTax.
        double purchaseAmount, totalAmount, totalPurchaseTax;
        
        //Creating a new scanner object, "keyboard".
        Scanner keyboard = new Scanner(System.in);
        
        //Displays instruction for user to follow.
        System.out.println("Please enter the amount of your purchase.");
        
        //Stores the user's next input as a double in purchaseAmount.
        purchaseAmount = keyboard.nextDouble();
        
        //Value of state taxes are store in purhcaseAmountStateTax.
        double purchaseAmountStateTax = (purchaseAmount * STATE_TAX);
        
        //Value of county taxes are stored in purchaseAmountCountyTax.
        double purchaseAmountCountyTax = (purchaseAmount * COUNTY_TAX);
        
        //Calculations for finding total tax of the purchase, then storing in totalPurchaseTax.
        totalPurchaseTax = (purchaseAmount * STATE_TAX) + (purchaseAmount * COUNTY_TAX);
        
        //Displays the total state and county taxes to user.
        System.out.println("The total of state taxes is: $" + purchaseAmountStateTax + " and county taxes is: $" 
        + purchaseAmountCountyTax + ". \nThe total taxes is: $" + totalPurchaseTax + ".");
        
        //Displays the total sale including taxes.
        System.out.println("The total of the sale is $" + (totalPurchaseTax + purchaseAmount) + ".");
    }
}
