package stepDefinition;

import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutNew {
	RequestSpecification req;
	   Response res;
	   ValidatableResponse validate;
	

	@Given("User will provide the new data in the existing payload")
	public void user_will_provide_the_new_data_in_the_existing_payload() {
		JSONObject obj = new JSONObject();
		obj.put("hotelid","SATYA_HOTEL_00316");
		obj.put("address","Kajipet");
		obj.put("area","Jagtial");
		obj.put("contact",8186056754l);
		obj.put("hotelname","Safari");
		obj.put("payment",5000.00);
		obj.put("website","https:\\Safari.com");
		 req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
	}

	@When("User Updates the data by using an api is {string}")
	public void user_updates_the_data_by_using_an_api_is(String string) {
	 res = req.put(string);
	}

	@Then("User will also validates the response body that the area is equal to {string}")
	public void user_will_also_validates_the_response_body_that_the_area_is_equal_to(String str) {
	 validate = res.then();
	 validate.assertThat().body("data.area",equalTo(str));
	}

	@Then("User will also validate the status line is {string}")
	public void user_will_also_validate_the_status_line_is(String line) {
	   validate.assertThat().statusLine(line).log().all();
	}

}
