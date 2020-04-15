package se.lexicon.michelle;
import java.util.Scanner;

public class ScannerUtil {
    /*
        Creates new Scanner object.
        this must be static to be able to be reached from withing other methods.
     */
    private static Scanner scanner = new Scanner(System.in);

    //fetches the users input into a string that is later returned.
    public static String getUserInput(){
        String userInput = scanner.nextLine();
        return userInput;
    }

    /*
        get a double from the user, returns an error if the value is not a double value.
     */
    public static double getDoubleFromUser(){
        double number = 0;
        boolean invalidDouble = true;
        while (invalidDouble){
            try{
                String numberAsString = getUserInput().trim();
                number = Double.parseDouble(numberAsString);
                invalidDouble = false;
            }catch(NumberFormatException e){
                //System.out.println(e);
                System.out.print("Invalid input. Please try again: " );
            }
        }
        return number;
    }

}
