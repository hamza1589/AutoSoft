package pageClass;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath="//div[@class='header__logo']/a/img")
      private WebElement logoValidation;

    @FindBy(xpath = "//*[contains(text(), 'Login')]")
    WebElement loginLink;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public String validateTitle(){
        return driver.getTitle();
    }


    public boolean validateLogoIsDisplayed(){
       return logoValidation.isDisplayed();


    }
    public LoginPage loginLogo(){
        loginLink.click();
        return new LoginPage();
    }

}
