package autoSoft.testCases;

import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClass.DashBoardPage;
import pageClass.HomePage;
import pageClass.LoginPage;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    DashBoardPage dashBoardPage;


    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        dashBoardPage=new DashBoardPage();
    }

    @Test(priority = 0)
    public void validateUserIsAbleToLogin(){
        loginPage=homePage.loginLogo();
        dashBoardPage=loginPage.validateUserIsAbleToRegister("123645","Test123","Mercury12");

    }
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
