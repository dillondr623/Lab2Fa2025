import java.util.Scanner;
/**
 * Importing the scanner function will allow interface with the console inputs.
 * The user is prompted to input a city name. Then the number of characters,
 * uppercase version, lowercase version, and the first character are output.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/12/2025
 * @version v1.0
 */
public class CityName {
    public static void main(String[] args) {
        //string declared for name storage
        String city;
       
        //reference input is made for scanner object to be created
        Scanner input = new Scanner(System.in);
        
        //user prompted for a city, then its name is initialized
        System.out.print("Enter a city: ");
        city = input.nextLine();
        
        //Sequentially output: number of characters, 
        //uppercase, lowercase, and first character
        System.out.println("\n" + "The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.substring(0,1));
    }
}