package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	@Test
	public void basic() {
		baseURI="https://api.github.com";
		//JSONObject obj = new JSONObject();
		//obj.put("name","Harsha6845");
		given().auth().basic("ailneniharshithrao","Subbu9666@")
		.when().get("/user/repos").then().log().all();
		
		
	}

}
