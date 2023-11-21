package steps;

import org.junit.Assert;


import net.serenitybdd.annotations.Step;
import pages.QaTestPage;

public class MonkeySurveyStep {

	QaTestPage QA;

	@Step("Navigating to MonkeySurvey.com website page")
	public void Navigate() {
		QA.open();

	}

	@Step("Choose your respond")
	public void ChooseRespond(String respond) {
		QA.getRespond(respond);
		QA.clickNext();
	}

	@Step("Verify survey text")
	public void VerifyText() {
		Assert.assertTrue(QA.text().contains("Have a nice day"));
	}

}
