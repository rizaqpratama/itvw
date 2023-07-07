package co.nvqa.interview.ui_pom;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaPointPage {



  private static final String  URL = "https://point-qa.ninjavan.co/";
  protected ChromeDriver driver;

  @FindBy(id = "username")
  private WebElement usernameField;

  public NinjaPointPage(ChromeDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this );
  }

  public void openPage() {
    // implement open page here
    driver.navigate().to(URL);
  }

  public void doLogin(String username, String password){
    Assertions.assertNotNull(usernameField);
    usernameField.sendKeys(username);

    // continue
  }

}
