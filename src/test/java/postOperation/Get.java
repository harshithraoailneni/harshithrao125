package postOperation;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Get {
	@Test()
	public void Get() {
	baseURI="http://localhost:8080";
	when().get("hotelall?area=jagtial")
	.then()
	.assertThat().statusCode(200)
	.log().all();
	}
	

}
