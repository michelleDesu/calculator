package se.lexicon.michelle;
import java.util.Scanner;

/**
 * Application need to be a Maven Project that runs with Java 8.
 * Application need to be able to perform mathematical operations addition, subtraction, multiplication and division.
 * The program should not stop running until the User choose to end it by terminating a loop.
 * Each mathematical operation should be testable by Junit.
 *
 */
public class App 
{
    //Example for Junit testing
    public static boolean isAdult(int age){
        return age >= 18;
    }

    public static String isObjDouble( Scanner obj){
        if(obj.hasNextDouble()){
            double number = obj.nextDouble();
            String state = "operator";
            String choice = obj.nextLine();
            return state;
        }else {
            System.out.println("The input was not a number! \n");
            String choice = obj.nextLine();
        }
        return "number";
    }
    public static void main( String[] args ) {
        double number;
        boolean quit = false;
        Scanner obj = new Scanner(System.in);
        String choice;
        String state = "number";

        //The calculator will run util q is pressed.
        while (!quit) {

            if (state.equals("number")) {
                System.out.println("Write a number:");
                state = isObjDouble(obj);

            } else {
                System.out.println("What type of operator do you want to use? \n" +
                        "( + , - , / , *, 'q' (to quit) )");
                choice = obj.nextLine();
                switch (choice) {
                    case "q":
                        quit = true;
                        System.out.println("Thank you for your time!\n See you soon!");
                        break;
                    case "+":

                        break;
                    case "-":
                        break;
                    case "/":
                        break;
                    case "*":
                        break;

                    default:
                        System.out.println("The value you typed is none of the suggested alternatives");

                }
                //choice = obj.nextLine();
            }


        }

    }
}
