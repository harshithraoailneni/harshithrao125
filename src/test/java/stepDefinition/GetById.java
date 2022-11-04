package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetById {
	 Response res;
	 ValidatableResponse validate;
	
	@When("User wants to retrieve the data he uses an api is {string}")
	public void user_wants_to_retrieve_the_data_he_uses_an_api_is(String url) {
	    res = RestAssured.get(url);
	}

	@Then("User will validate the statuscode is {int}")
	public void user_will_validate_the_statuscode_is(Integer int1) {
	   validate = res.then();
	    validate.assertThat().statusCode(int1);
	    }

	@Then("User will also the checks the content type is {string}")
	public void user_will_also_the_checks_the_content_type_is(String string) {
		validate.assertThat().contentType(string);
		validate.log().all();
	}

}
