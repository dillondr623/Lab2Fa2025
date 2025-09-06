/**
 * Utilizing a single print statement, the output will be 3
 * seperate lines: 1 name, 2 major, and 3 hobby.
 * @author Dillon Roberto, droberto@student.sdccd.edu
 * @since 9/6/2025
 * @version v1.0
 */

public class AboutMe {
    public static void main(String[] args) {
        //Strings declared and initalized
        String name = "Dillon Roberto";
        String major = "Electrical Engineering";
        String hobby = "fishing";
        
        //each string has own line, using 1 print method call
        System.out.println( (name + "\n") + (major + "\n") + 
            ("The hobby I enjoy most is " + hobby) );
    }
}