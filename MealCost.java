import java.util.Scanner;
/**
 * Importing the scanner function will allow interface with the console inputs.
 * To calculate the total cost of a meal, the user is prompted to enter the cost,
 * before the tax and tip. The fixed rate tax and tip are then used to calculate
 * the total cost of the meal, which is then output.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/12/2025
 * @version v1.1
 */
public class MealCost {
    public static void main(String[] args) {
        //before and after costs are declared as double types
        double originalCost, taxedAmount, tippedAmount, costWithTipnTax;
        
        //finals are used since rates are fixed values
        final double TAX_RATE = 0.0675; // 6.75% tax rate
        final double TIP_RATE = 0.20;   // 20% tip
        
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted for meal amount
        System.out.print("Enter meal amount: $");
        originalCost = input.nextDouble();
        
        //calculates amount taxed
        taxedAmount = originalCost * TAX_RATE;
        System.out.print("\nThe tax is: $");
        System.out.printf("%.2f",(taxedAmount));
        
        //calculates amount to tip
        tippedAmount = originalCost * TIP_RATE;
        System.out.print("\nThe tip is: $");
        System.out.printf("%.2f",(tippedAmount));
        
        //calculates overall cost of meal
        costWithTipnTax = originalCost + taxedAmount + tippedAmount;
        System.out.print("\nThe meal cost with tax and tip is: $");
        System.out.printf("%.2f",(costWithTipnTax));
    }
}