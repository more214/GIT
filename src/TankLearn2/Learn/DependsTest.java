package TankLearn2.Learn;

import org.testng.annotations.Test;

public class DependsTest {
    
    
    
    @Test
    public void testMessage(){
        System.out.println("this is test message");
    }
    
    @Test(dependsOnMethods = {"testMessage"})
    public void setupEnv(){
        System.out.println("this is setup Env");
    }
    
}