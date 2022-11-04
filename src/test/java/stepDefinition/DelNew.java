package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DelNew {
	  Response res;
	  ValidatableResponse validate ;
	@When("User wants to delete the data uses an api is {string}")
	public void user_wants_to_delete_the_data_uses_an_api_is(String str) {
	res = RestAssured.delete(str);
	}

	@Then("User will validates the status code is {int}")
	public void user_will_validates_the_status_code_is(Integer int1) {
	 validate = res.then();
	 validate.assertThat().statusCode(int1).log().all();
	}

}
