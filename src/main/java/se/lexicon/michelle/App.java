package se.lexicon.michelle;
//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Application need to be a Maven Project that runs with Java 8.
 * Application need to be able to perform mathematical operations addition, subtraction, multiplication and division.
 * The program should not stop running until the User choose to end it by terminating a loop.
 * Each mathematical operation should be testable by Junit.
 *
 */
public class App {

    public static void main( String[] args ) {
        double  number = 0,
                secondNumber = 0,
                sum = 0;
        boolean quit = false;
        //Scanner obj = new Scanner(System.in);
        Calculus calc = new Calculus();
        String state = "number";

        //The calculator will run util q is pressed.
        while (!quit) {
            //String input;
           // String input = ScannerUtil.getUserInput();

            if (state.equals("number")) {
                number = getInputNumber();;
                state = "operator";

            } else {
                System.out.println("What type of operator do you want to use? \n" +
                        "( + , - , / , *, 'q' (to quit) , 'c' (restart calculator) )");
                String input = ScannerUtil.getUserInput();

                switch (input.toLowerCase()) {
                    //If q is pressed the user wants to exit the program
                    case "q":
                        quit = true;
                        System.out.println("Thank you for your time!\n See you soon!");
                        break;
                    //add two numbers together and stores them in another
                    case "c":
                            state = "number";
                        break;

                    case "+":
                        secondNumber = getInputNumber();
                        sum = calc.addNumbers(number, secondNumber );
                        number = sum;
                        printSum(sum);
                        break;

                    case "-":
                        secondNumber = getInputNumber();
                        sum = calc.subractNumbers(number, secondNumber);
                        number = sum;
                        printSum(sum);
                        break;

                    case "/":
                        secondNumber = getInputNumber();
                        if(calc.isDivisionByZero(secondNumber) ){
                            break;
                        }
                        sum = calc.divideNumbers(number, secondNumber);
                        number = sum;
                        printSum(sum);
                        break;

                    case "*":
                        secondNumber = getInputNumber();
                        sum = calc.multiplyNumbers(number, secondNumber);
                        number = sum;
                        printSum(sum);
                        break;

                    default:
                        System.out.println("The value you typed is none of the suggested alternatives");

                }
                //choice = obj.nextLine();
            }


        }

    }

    //Gets a number from user
    public static double getInputNumber(){
      System.out.print("Write a number: ");
      double number =  ScannerUtil.getDoubleFromUser();
        return number;
    }

    //Prints out the sum as a string to the console
    public static void printSum(double sum){
        System.out.println("The sum of the two numbers you wrote is: " + sum + "\n");
    }

}
