/**
 * Using a series of print statements, we will construct a
 * Diamond out of the symbol * in 7 lines, 
 * acending in odd intervals from 1 to 7,
 * then decend back down to 1.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/6/2025
 * @version v1.0
 */

public class Diamond {
    public static void main(String[] args) {
        //spaces before * ensures proper alignment in diamond
        System.out.println("   *");    //3 spaces is centered
        System.out.println("  ***");   //2 spaces is centered
        System.out.println(" *****");  //1 space is centered
        System.out.println("*******"); //already centered
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }
}