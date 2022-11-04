package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Del {
	  Response res;
	  ValidatableResponse validate;
	@When("User delete the data by using an api {string}")
	public void user_delete_the_data_by_using_an_api(String url) {
	res = RestAssured.delete(url);
	}

	@Then("User  checks the status code is {int}")
	public void user_checks_the_status_code_is(Integer code) {
	validate = res.then();
	validate.assertThat().statusCode(code);

	}

}
