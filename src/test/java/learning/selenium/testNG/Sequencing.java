package learning.selenium.testNG;

import org.testng.annotations.*;

public class Sequencing {

    @BeforeSuite
    public void test1(){
        System.out.println("Before Suite");

    }

    @BeforeTest
    public void test2(){
        System.out.println("Before Test");

    }

    @BeforeClass
    public void test3(){
        System.out.println("Before Class");

    }


    // it will execute before each Test Case
    @BeforeMethod
    public void test4(){
        System.out.println("Before Method");
    }

    @Test
    public void test10(){
        System.out.println("Test Case 1 executed");
    }

    @Test
    public void test11(){
        System.out.println("Test Case 2 Excecuted");
    }

    @AfterMethod
    public void test200(){
        System.out.println("After Method");
    }

    @AfterClass
    public void test207(){
        System.out.println("After Class");
    }
    @AfterTest
    public void test206(){
        System.out.println("After Method");
    }
    @AfterSuite
    public void test20i76(){

        System.out.println("After Suite");
    }

}
