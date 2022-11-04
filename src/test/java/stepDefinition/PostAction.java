package stepDefinition;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostAction {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	@Given("User wants to provide the data")
	public void user_wants_to_provide_the_data() {
	JSONObject obj = new JSONObject();
	obj.put("address","Kajipet");
	obj.put("area","warangal");
	obj.put("contact",8186056754l);
	obj.put("hotelname","Safari");
	obj.put("payment",5000.00);
	obj.put("website","https:\\Safari.com");
	req=RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	}
	@When("User posts the data by using the api is {string}")
	public void user_posts_the_data_by_using_the_api_is(String url) {
	res=req.post(url);
	}

	@Then("User checks the Status code is {int}")
	public void user_checks_the_status_code_is(Integer int1) {
	   validate=res.then();
	   validate.statusCode(int1);
	   validate.log().all();
	   
	}
}
