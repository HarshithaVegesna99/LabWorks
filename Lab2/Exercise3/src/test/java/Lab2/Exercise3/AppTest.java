package Lab2.Exercise3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
    App a;
    @Test
    public void testGetSorted() {
    	int array[] = { 10, 33, 32, 19, 25, 98, 75, 45 };
    	int[] arr1 = a.getSorted(array);
    	assertEquals(1, arr1[0]);
    }
}