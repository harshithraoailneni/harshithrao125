package postOperation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class putNew {
	@Test
	public void Put() {
		JSONObject obj = new JSONObject();
		obj.put("hotelid","SATYA_HOTEL_00154");
		obj.put("address","Huzurnagar");
		obj.put("area","warangal");
		obj.put("contact",8186056754l);
		obj.put("hotelname","Safari");
		obj.put("payment",5000.00);
		obj.put("website","https:\\Safari.com");
	given().body(obj).contentType(ContentType.JSON)
	.when().put("http://localhost:8080/hotel?id=SATYA_HOTEL_00154")
	.then().assertThat().statusCode(200).contentType(ContentType.JSON)
	.statusLine("HTTP/1.1 200 ").body("data.hotelid",equalTo("SATYA_HOTEL_00154"))
	.body("data.area", containsString("war"))
	.header("Transfer-Encoding","chunked")
	.log().all();
	
	}
	

}
