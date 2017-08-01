package TankLearn2.Learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
    
    @Test
    @Parameters({"test1","test2"})
    public void ParaTest(String test1,String test2){
        System.out.println("This is " + test1+test2);
    }
}