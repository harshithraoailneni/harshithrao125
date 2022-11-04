package postOperation;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PostMethod {
	public static void main(String[] args) {
	JSONObject obj = new JSONObject();
	obj.put("address","Huzurnagar");
	obj.put("area","warangal");
	obj.put("contact",8186056754l);
	obj.put("hotelname","Safari");
	obj.put("payment",5000.00);
	obj.put("website","https:\\Safari.com");
given().body(obj).contentType(ContentType.JSON)
.when().post("http://localhost:8080/hotel")
.then().assertThat().statusCode(200).contentType(ContentType.JSON)
.statusLine("HTTP/1.1 200 ").body("data.hotelname",equalTo("Safari"))
.body("data.area", containsString("warangal")).log().all();
}
}