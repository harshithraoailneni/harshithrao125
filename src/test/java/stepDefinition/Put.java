package stepDefinition;

import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Put {
	RequestSpecification req;
	Response res;
	 ValidatableResponse validate;
	@Given("User wants to update the existing the data")
	public void user_wants_to_update_the_existing_the_data() {
		JSONObject obj = new JSONObject();
		obj.put("hotelid","SATYA_HOTEL_00317");
		obj.put("address","Kajipet");
		obj.put("area","warangal");
		obj.put("contact",8186056754l);
		obj.put("hotelname","Safari");
		obj.put("payment",5000.00);
		obj.put("website","https:\\Safari.com");
		req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
	}

	@When("user put the data using an api {string}")
	public void user_put_the_data_using_an_api(String url) {
	res = req.put(url);
	}

	@Then("User checks the status code is {int} or not")
	public void user_checks_the_status_code_is_or_not(Integer code) {
	validate = res.then();
	validate.assertThat().statusCode(code);
	}

	@And("User also checks the contentType")
	public void user_also_checks_the_content_type() {
	    validate.assertThat().contentType(ContentType.JSON);
	}
	@Then("User will also validate the response body whether hotelid is equal to {string}")
	public void user_will_also_validate_the_response_body_whether_hotelid_is_equal_to(String string) {
	    validate.assertThat().body("data.hotelid",equalTo(string));
	}

}
