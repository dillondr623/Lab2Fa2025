import java.util.Scanner;
/**
 * Importing the scanner function will allow interface with the console inputs.
 * This is an investment cost calculator. At a fixed commission rate of 2%,
 * the user will input how many shares and at what price they purchased them at.
 * A breakdown of purchase and commission will be output, along with total cost.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/13/2025
 * @version v1.0
 */
public class Investments {
    public static void main(String[] args) {
        //total, amout and price of shares declared as double types
        double totalCost;
        double numShares;                   //assumes fractional shares availible
        double pricePerShare;
        
        
        //final used since rate is a fixed value
        final double commissionRate = 0.02; //2% commission rate
                
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted for amount of shares
        System.out.print("Enter number of shares purchased: ");
        numShares = input.nextDouble();
        
        //user prompted for price of a share
        System.out.print("Enter price per share: $");
        pricePerShare = input.nextDouble();
        
        //calculates cost of purchased shares
        double shareCost = numShares * pricePerShare;
        System.out.print("\n" + "Total cost of shares are: $");
        System.out.printf("%,1.2f",(shareCost));
        
        //calculates commission to be paid
        double commissionCost = shareCost * commissionRate;
        System.out.print("\n" + "Commission cost is: $");
        System.out.printf("%,1.2f",(commissionCost));
        
        //calculates overall cost of purchase
        totalCost = shareCost + commissionCost;
        System.out.print("\n" + "Total Cost is: $");
        System.out.printf("%,1.2f",(totalCost));
    }
}