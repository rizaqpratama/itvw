
package co.nvqa.interview.api;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
public class APItesting {
  
@Test
  public void testJsonPlaceholder() {
    String url = "https://jsonplaceholder.typicode.com/users";
    Response r = given().get(url);
    r.then().statusCode(200);
    
  }

}