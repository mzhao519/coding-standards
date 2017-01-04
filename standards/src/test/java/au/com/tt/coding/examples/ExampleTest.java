package au.com.tt.coding.examples;

import static org.testng.AssertJUnit.fail;

import org.testng.annotations.Test;

@Test
public class ExampleTest
{
    public void simpleSuccessTest()
    {
        // Set up

        // Exercise component

        // Verify

        // Tear down
    }

    @Test(expectedExceptions = { RuntimeException.class })
    public void expectedExceptionTest()
    {
        // Set up

        try
        {
            // Exercise component
        }
        finally
        {
            // Verification

            // Tear down
        }
    }

    public void expectedExceptionWithExceptionVerificationTest()
    {
        // Set up

        try
        {
            // Exercise component

            fail("Expected RuntimeException");
        }
        catch (RuntimeException re)
        {
            // Verification
        }

        // Tear down
    }
}