package co.nvqa.interview.ui_pom;

import co.nvqa.interview.ui.NinjaPoint;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaPointTest {

  private ChromeDriver driver = null;
  private NinjaPointPage page;
  private static final String USERNAME = "randomusername";
  private  static final String PASSWORD  = "randompassword";



  public NinjaPointTest() {
    driver = new ChromeDriver();
    page = new NinjaPointPage(driver);
  }


  @Test
  public void testLogin() {
    page.openPage();
    page.doLogin(USERNAME, PASSWORD);
  }



}
