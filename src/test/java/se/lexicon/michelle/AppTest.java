package se.lexicon.michelle;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * Testing agefunction
     */
    @Test
    public void test_isAdult_true(){
        int age = 18;
        Assert.assertTrue(App.isAdult((age)));
    }
    @Test
    public void test_isAdult_false(){
        int age = 17;
        Assert.assertFalse(App.isAdult((age)));
    }
}
