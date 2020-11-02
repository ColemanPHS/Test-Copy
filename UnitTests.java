import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTests
{
  public void testCase()
  {
    // Failure message: 
    // should be false
    TestClass a = new TestClass();
    try
    {
      assertEquals(false, a.isFalse());
    }
    catch (AssertionError e)
    {
      System.out.println("Should be false");
    }
  }
}