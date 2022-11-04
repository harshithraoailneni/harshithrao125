package postOperation;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import pojoClass.Post;
import pojoClass.Post1;

import static io.restassured.RestAssured.*;

public class Hotel156 {
		@Test
		public void postHotel() {
			baseURI="http://localhost:8080";
			Post1 ph=new Post1("RoadNo5","Saidabad",8897669598l,"Andhra", 4000.00, "http:\\AndhraHotel.com","156");
			given().body(ph).contentType(ContentType.JSON)
			.when().post("/hotel")
			.then().assertThat().statusCode(200).contentType(ContentType.JSON)
			.body("data.area",equalTo("Saidabad")).log().all();
		}

	
}
