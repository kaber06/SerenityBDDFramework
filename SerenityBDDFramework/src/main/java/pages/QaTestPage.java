package pages;

import java.util.ArrayList;
import java.util.List;

import base.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;

public class QaTestPage extends BasePage {

	public ArrayList<String> list = new ArrayList<String>();
	String labels = "tag=//label";
	String btn = "xpath=//*[@id=\"patas\"]/main/article/section/form/div[2]/button";
	String text = "xpath=//*[@id=\"patas\"]/main/article/section/div[3]/div";

	public void getRespond(String respond) {
		List<WebElementFacade> responds = getElements(labels);

		for (WebElementFacade label : responds) {
			String labelText = label.getText();
			if (labelText.equals(respond)) {
				label.click();
				break;
			}
		}
	}

	public void clickNext() {
		click(btn);
	}

	public String text() {
		return getText(text);
	}
}
