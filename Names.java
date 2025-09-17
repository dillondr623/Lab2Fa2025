import java.util.Scanner;
/**
 * Importing the scanner function will allow interface with the console inputs.
 * The user will be prompted to input their first, middle, and last names,
 * in which both the full name and the initals will be output,
 * concluding the application.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/12/2025
 * @version v1.1
 */
public class Names {
    public static void main(String[] args) {
        //strings are declared for name storage
        String firstName, middleName, lastName;
        //chars are declared for storage of initals for name
        char firstInit, middleInit, lastInit;
        
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted for names, then name and initials are initialized
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        firstInit = firstName.charAt(0);
         
        System.out.print("Enter your middle name: ");
        middleName = input.nextLine();
        middleInit = middleName.charAt(0);
        
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        lastInit = lastName.charAt(0);
        
        //full name is printed
        System.out.print("\n" + "My name is: ");
        System.out.println(firstName + " " + middleName + " " + lastName);
        //initials are printed
        System.out.print("My initials are: ");
        System.out.println("" + firstInit + middleInit + lastInit);
    }
}