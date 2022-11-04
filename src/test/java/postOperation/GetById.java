package postOperation;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetById {
	@Test
	public void Get() {
		baseURI="http://localhost:8080";
		when().get("/SATYA_HOTEL_00002/hotel")
		.then().assertThat().statusCode(200).body("data.address",equalTo("Hyd,Punjagutta"))
		.log().all();
		
	}

}
