import javax.swing.JOptionPane;
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

//Ask for cost of meal, then display the meal charge, tax amount, tip amount, and total bill
//on the screen.

public class RestuarantBill
{
    public static void main()
    {
        //Initializes taxPercent to hold value of 0.0675.
        double taxRate = 6.75/100.0;
        
        //Initializes taxPercent to hold value of 0.2.
        double tipRate = 20.0/100;
        
        //Declares variable mealCharge to hold a double value.
        double mealCharge;
        
        //Displays popup with a prompt for user to enter value, stores String value in input.
        String input = JOptionPane.showInputDialog("Please enter the cost of your meal.");
        
        //Converts the String value held in input and stores it in the double mealCharge.
        mealCharge = Double.parseDouble(input);
        
        //Initializes taxAmount to store the product of mealCharge and taxPercent.
        double taxAmount = mealCharge * taxRate;
        
        //Initializes tipAmount to store product of the sum of mealCharge and taxAmount multiplied
        //by tipPercent.
        double tipAmount = (mealCharge + taxAmount) * tipRate;
        
        //Initializes totalBill to store sum of mealCharge, taxAmount, and tipAmount.
        double totalBill = mealCharge + taxAmount + tipAmount;
        
        //Displays pop up containing values for mealCharge, taxAmount, tipAmount, and
        //the totalBill variables.
        JOptionPane.showMessageDialog(null, "Your meal charge is $" + mealCharge + ".\n" 
        + "Tax amount: $" + taxAmount + ".\n" + "Your tip amount: $" + tipAmount + ".\n"
        + "Your total bill is: $ " + totalBill + ".");     
    }
}
