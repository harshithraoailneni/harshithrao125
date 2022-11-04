package postOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClass.Post;
import pojoClass.Put;

public class Put12 {
	@Test
	public void postHotel() {
		baseURI="http://localhost:8080";
		Put pu=new Put("SATYA_HOTEL_00001","RoadNo5","Bandlaguda", 9701825564l, "Smart", 3000.00, "http:\\Smart.com");
		given().body(pu).contentType(ContentType.JSON)
		.when().put("/hotel?id=SATYA_HOTEL_00001")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.log().all();
	}

}
