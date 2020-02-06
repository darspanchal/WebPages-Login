package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationChecker { // Main Class

    static protected WebDriver driver;

   @Test
   public void skyregistration() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();// maximize window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sky.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.id("title")).sendKeys("Mr");
        driver.findElement(By.id("firstname")).sendKeys("abc");
        driver.findElement(By.id("lastname")).sendKeys("def");
        driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("sky@09876");
        driver.findElement(By.id("confirmPassword")).sendKeys("sky@09876");
    }

    @Test
    public void Orangehrmlive() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }

    @Test
    public void MockPlus() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mockplus.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.className("user-btn")).click();
        driver.findElement(By.id("email")).sendKeys("abc123@test.com");
        driver.findElement(By.id("password")).sendKeys("abc123");
        driver.findElement(By.id("cofPassword")).sendKeys("abc123");
        driver.findElement(By.id("agree")).click();
        driver.findElement(By.id("register")).click();
    }

    @Test
    public void ocado() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ocado.com/webshop/startWebshop.do");
        driver.findElement(By.id("register")).click();   //click on register button
        driver.findElement(By.id("title")).sendKeys("Mr");
        driver.findElement(By.id("firstName")).sendKeys("David");
        driver.findElement(By.id("lastName")).sendKeys("Cameron");
        driver.findElement(By.id("login")).sendKeys("abc123@gmail.com");//
        driver.findElement(By.id("password")).sendKeys("Abc123");
        driver.findElement(By.id("postcode")).sendKeys("AB1 2CD");
    }

    @Test
    public void zaraRegistartion() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get("https://www.zara.com/uk/");
        driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/nav/ul/li[1]/a")).click();
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.id("email-form")).sendKeys("darspanchal@gmail.com");
        driver.findElement(By.id("new-password-form")).sendKeys("London@99");
        driver.findElement(By.id("password-confirm-form")).sendKeys("London@99");
        driver.findElement(By.id("first-name")).sendKeys("abc");
        driver.findElement(By.id("last-name")).sendKeys("def");
        driver.findElement(By.id("address-1")).sendKeys("10 Talbot Road ");
        driver.findElement(By.id("zip-code")).sendKeys("HA0 4UG");
        driver.findElement(By.id("city")).sendKeys("London");
        driver.findElement(By.id("phone-1")).sendKeys("1234567890");
        driver.findElement(By.id("sign-up-button")).click();
    }
}
