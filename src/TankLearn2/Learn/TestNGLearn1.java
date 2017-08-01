package TankLearn2.Learn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGLearn1 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
    }
    
    @Test
    public void TestNgLearn1() {
        System.out.println("this is TestNG test case1");
    }
    @Test
    public void TestNgLearn2() {
        System.out.println("this is TestNG test case2");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}