package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByArea {
	Response res;
	 ValidatableResponse validate;
	@When("User is getting the data by using an api is {string}")
	public void user_is_getting_the_data_by_using_an_api_is(String url) {
	res = RestAssured.get(url);
	}

	@Then("User checks the status code is {int}")
	public void user_checks_the_status_code_is(Integer code) {
	   validate = res.then();
	   validate.assertThat().statusCode(code);
	}

	@And("User wants to check the content type is {string}")
	public void user_wants_to_check_the_content_type_is(String json) {
	  validate.assertThat().contentType(json);
	  validate.log().all();
	}

}
