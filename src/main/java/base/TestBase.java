package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public   static WebDriver driver;
    public  static Properties properties;

    public TestBase() {
        properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/config/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialization() {
        String browserName = properties.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C://Users//hamza//Downloads//chromedriver_win32 (6)//chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("FF")) {
            System.setProperty("webdriver.gecko.driver", "C://Users//hamza//Downloads//geckodriver-v0.30.0-win64//geckodriver.exe");

        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));

    }
}

