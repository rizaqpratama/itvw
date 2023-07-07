package co.nvqa.interview.ui;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaPoint {
    private ChromeDriver driver = null;
    private static final String USERNAME = "randomusername";
    private  static final String PASSWORD  = "randompassword";
    private static final String  URL = "https://point-qa.ninjavan.co/";


    public NinjaPoint() {
        //initate
        driver = new ChromeDriver();
    }

    @Test
    public void openNinjaPoint_wrong_username_password() {
        driver.get(URL);
        // username field
        WebElement usernameField = driver.findElement(By.id("username"));
        //continue...

    }
}
