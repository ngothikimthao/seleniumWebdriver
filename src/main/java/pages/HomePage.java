package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("From Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage lickFormAuthenticaton(WebDriver driver){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}