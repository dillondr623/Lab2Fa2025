/**
 * Employing extreme values, we can show the level of
 * error propagated using basic mathematic operations.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/6/2025
 * @version v1.0
 */

public class Imprecision {
    public static void main (String[] args) {
        double x, y, z;     //declares double type variables
        
        x = 1.23456789e200; //initializes the varibles
        y = 1/x;
        z = x*y;
        
        //the following prints each value on a separate line
        System.out.println("The value of x is : " + 
            (x));
        System.out.println("The value of y is : " +
            (y));
        System.out.println("The value of z is : " +
            (z));
        System.out.println("The value of 1 - z is : " +
            (1 - z));
    }
}