package postOperation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteById {
	@Test
	public void delete() {
		baseURI="http://localhost:8080";
		when().delete("/hoteldel?hotelid=SATYA_HOTEL_00754")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		}
	}


