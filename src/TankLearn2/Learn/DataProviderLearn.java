package TankLearn2.Learn;
import java.security.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {
    
    @DataProvider(name="user")
    public Object[][] Users(){
        return new Object[][]{
                {"root","passowrd"},
                {"cnblogs.com", "tankxiao"},
                {"tank","xiao"}
        };
    }
    
    @Test(dataProvider="user")
    public void verifyUser(String userName, String password){
        System.out.println("Username: "+ userName + " Password: "+ password);
    }
}