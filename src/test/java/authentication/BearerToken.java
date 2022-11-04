package authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class BearerToken {
	public static void main(String[] args) {
		baseURI="https://api.github.com";
		JSONObject object=new JSONObject();
		object.put("name","harshithrao125");
		given().auth().oauth2("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")
.body(object).contentType(ContentType.JSON)
.when().post("/user/repos")
.then().log().all();
}
}
