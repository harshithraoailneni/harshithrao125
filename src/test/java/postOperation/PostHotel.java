package postOperation;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import pojoClass.Post;

import static io.restassured.RestAssured.*;

public class PostHotel {

	@Test
	public void postHotel() {
		baseURI="http://localhost:8080";
		Post ph=new Post("RoadNo2","Dilsukhnagar", 9666006675l,"Yash", 4000.00, "www.YashHotel.com");
		given().body(ph).contentType(ContentType.JSON)
		.when().post("/hotel")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.statusLine("HTTP/1.1 200 ").body("data.address",equalTo("RoadNo2"))
		.body("data.hotelname", containsString("Yash")).log().all();
	}

	

}
