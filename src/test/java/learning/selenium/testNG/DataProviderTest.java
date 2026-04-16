package learning.selenium.testNG;

import org.testng.annotations.DataProvider;

public class DataProviderTest {


    @DataProvider(name="loginData")
    public Object[][] getData(){

        return new Object[][]{  {"tr90wq@eample.com","Password@123"},{"kamlesh@gmail.com","Test@1234"}  };
    }

}
