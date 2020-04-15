package se.lexicon.michelle;

import org.junit.Assert;
import org.junit.Test;

public class CalculusTest {

    /*
        Testing Addition
     */

    @Test
    public void given_positive_number_add_return_correct_sum(){
        double firstNum = 10,
                secondNum = 15,
                actualSum = Calculus.addNumbers(firstNum, secondNum),
                expectedSum = 25 ;

        Assert.assertEquals(expectedSum, actualSum, 0);
    }
    @Test
    public void given_negative_number_add_return_correct_sum(){
        double firstNum = -10,
                secondNum = -15,
                actualSum = Calculus.addNumbers(firstNum, secondNum),
                expectedSum = -25 ;

        Assert.assertEquals(expectedSum, actualSum, 0);
    }

    /*
        Testing Subtraction
     */
    @Test
    public void given_positive_number_subtraction_return_correct_sum(){
        double firstNum = 15,
                secondNum = 10,
                actualSum =Calculus.subractNumbers(firstNum, secondNum),
                expectedSum = 5 ;

        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void given_negative_number_subtraction_return_correct_sum(){
        double firstNum = -15,
                secondNum = -10,
                actualSum = Calculus.subractNumbers(firstNum, secondNum),
                expectedSum = -5 ;


        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    /*
       Testing division
    */
    @Test
    public void given_positive_numbers_division_return_correct_sum(){
        double firstNum = 10,
                secondNum = 2,
                actualSum =Calculus.divideNumbers(firstNum, secondNum),
                expectedSum = 5 ;

        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void given_one_negative_and_one_positive_number_division_return_correct_sum(){
        double firstNum = -10,
                secondNum = 2,
                actualSum = Calculus.divideNumbers(firstNum, secondNum),
                expectedSum = -5 ;


        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void given_two_negative_number_division_return_correct_sum(){
        double firstNum = -30,
                secondNum = -15,
                actualSum = Calculus.divideNumbers(firstNum, secondNum),
                expectedSum = 2 ;


        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    /*
      Test isDivisionByZero
     */
    @Test
    public void given_number_divide_by_zero_return_false(){
        double number = 30;

        Assert.assertFalse(Calculus.isDivisionByZero(number));

    }
    @Test
    public void given_number_divide_by_zero_return_true(){
        double number = 0;
        Assert.assertTrue(Calculus.isDivisionByZero(number));
    }

    /*
      Testing multiplication
   */
    @Test
    public void given_positive_numbers_multiplication_return_correct_sum(){
        double firstNum = 10,
                secondNum = 2,
                actualSum =Calculus.multiplyNumbers(firstNum, secondNum),
                expectedSum = 20;

        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void given_one_negative_and_one_positive_number_multiplication_return_correct_sum(){
        double firstNum = -10,
                secondNum = 2,
                actualSum = Calculus.multiplyNumbers(firstNum, secondNum),
                expectedSum = -20 ;


        Assert.assertEquals(expectedSum, actualSum, 0);

    }

    @Test
    public void given_two_negative_number_multiplication_return_correct_sum(){
        double firstNum = -3,
                secondNum = -5,
                actualSum = Calculus.multiplyNumbers(firstNum, secondNum),
                expectedSum = 15 ;


        Assert.assertEquals(expectedSum, actualSum, 0);

    }





}
