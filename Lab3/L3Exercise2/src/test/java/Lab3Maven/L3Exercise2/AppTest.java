package Lab3Maven.L3Exercise2;
import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest {
	private App app;
    public void setup()
    {
    	app= new App(); 
    }
    @Test
    public void StringReverse_GivenString_ShouldReturnNull()
    {
    	String sb= new String("");
    	String result= App.stringReverse(sb);
        assertEquals(null, result );
    }
    @Test
    public void stringReverse_GivenSameCharactersInString_ShouldReturnSameString()
    {
    	String sb= new String("SSS");
    	String result= App.stringReverse(sb);
        assertEquals("SSS|SSS", result.toString() );
    }
    @Test
    public void StringReverse_GivenString_ShouldReturnReverse()
    {
    	String sb= new String("HARSHI");
    	
    	String expected= new String("HARSHI|IHSRAH");
    	String result= App.stringReverse(sb);
    	
        assertEquals( expected.toString(), result.toString());
    }
}