package se.lexicon.michelle;

public class Calculus {
    //This function adds two numbers together
    public static Double addNumbers(double num, double secondNum){

        return num + secondNum;
    }

    //Subtracts the provided numbers
   public static double subractNumbers(double num, double secondNum){
        return num - secondNum;
    }

    //divides the provided numbers
    public static Double divideNumbers(double num, double secondNum){
        return num / secondNum;
    }

    //multiply the provided numbers
    public static double multiplyNumbers(double num, double secondNum){
        return num * secondNum;
    }

    //returns true if the provided number is 0
    public static boolean isDivisionByZero(double number){
        if(number == 0){
            System.out.println("Division by zero is not allowed" );
            return true;
        }
        return false;
    }



}
