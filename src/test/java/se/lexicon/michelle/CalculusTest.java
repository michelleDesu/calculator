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
}
