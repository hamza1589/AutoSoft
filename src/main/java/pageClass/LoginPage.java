package pageClass;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
 @FindBy(xpath="//div[@id='login-flex']/div[2]/form/div[3]")
    WebElement companyId;

 @FindBy(css="#tenantUsername")
    WebElement useName;

    @FindBy(css="#password")
    WebElement password;

    @FindBy(css="#login")
     WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }


    public DashBoardPage validateUserIsAbleToRegister(String id, String user, String pass){
        companyId.sendKeys(id);
        useName.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
        return new DashBoardPage();

    }

}
