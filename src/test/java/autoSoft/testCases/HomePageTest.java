package autoSoft.testCases;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClass.HomePage;
import pageClass.LoginPage;

public class HomePageTest extends TestBase {
     HomePage homePage;
     LoginPage loginPage;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage=new HomePage();

    }

    @Test(priority = 0)
    public void validateTitlePage(){
        String title=homePage.validateTitle();
        Assert.assertEquals(title,"Best Dealer Management Systems | Autosoft DMS");
    }

    @Test(priority = 2)
    public void validateLogo(){
        boolean flag=homePage.validateLogoIsDisplayed();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void validateUserIsAbleToClickOnLogin(){
        loginPage=homePage.loginLogo();
        homePage.validateTitle();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
