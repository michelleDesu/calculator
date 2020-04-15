package se.lexicon.michelle;

import org.junit.Assert;
import org.junit.Test;

public class CalculusTest {

    @Test
    public void given_correct_number_add_return_correct_sum(){
        double firstNum = 10,
                secondNum = 15,
                actualSum = 0,
                expectedSum = 25 ;

        actualSum = Calculus.addNumbers(firstNum, secondNum);
        Assert.assertEquals(expectedSum, actualSum, 0);


    }
    @Test
    public void given_correct_number_add_return_incorrect_sum(){
        double firstNum = 10,
                secondNum = 15,
                actualSum = 0,
                expectedSum = 25 ;

        actualSum = Calculus.addNumbers(firstNum, secondNum);
        Assert.assertEquals(expectedSum, actualSum, 0);


    }
}
