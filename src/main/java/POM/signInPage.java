package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperties;

public class signInPage  extends abstractClass{
    private WebDriver driver;

    public signInPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }



    //    public void signInMethod() {
//
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("serdar2225@hotmail.com");
//        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Air2021@");
//        driver.findElement(By.cssSelector("//button[normalize-space()='Log in']")).click();
//    }
    @FindBy(xpath="//input[@id='email']")
    private WebElement inputUserName;

    @FindBy(xpath="//input[@id='Password']")
    private WebElement inputPassword;

    @FindBy(xpath="//button[normalize-space()='Log in']")
    private WebElement buttonLogin;

    public void getInputUserName() {
        sendKeys(inputUserName, ReadProperties.getData("Username"));
    }
    public void getPassword() {
        sendKeys(inputPassword, ReadProperties.getData("Password"));
    }

    public void clickOnLoginButton() {
       clickFunction(buttonLogin);
    }

}
