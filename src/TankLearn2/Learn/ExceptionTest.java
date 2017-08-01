package TankLearn2.Learn;

import org.testng.annotations.Test;

public class ExceptionTest {
    
    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
    public void testException(){
        throw new IllegalArgumentException("NullPoint");
    }
}