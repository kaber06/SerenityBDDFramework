package cucumbersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.MonkeySurveyStep;

public class OpenPageStep {

	@Steps
	MonkeySurveyStep survey;
	
	@Given("^user navigate to the website$")
	public void user_navigate_to_the_website() {
		survey.Navigate();
	}
	
	@When("^user choose the respond to the survey$")
	public void user_choose_the_respond_to_the_survey() {
		survey.ChooseRespond("Good");
	}
	
	@Then("^user validate page respond$")
	public void user_validate_page_respond() {
		survey.VerifyText();	
	}
	
}
