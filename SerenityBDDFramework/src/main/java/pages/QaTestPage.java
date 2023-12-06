package pages;

import java.util.ArrayList;
import java.util.List;

import base.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;

public class QaTestPage extends BasePage {

	public ArrayList<String> list = new ArrayList<String>();
	//String labels = "tag=//label/span[2]";
	String good = "xpath=//*[@id=\"597187964_3931970060_label\"]/span[2]";
	String okay = "xpath=//*[@id=\"597187964_3931970061_label\"]/span[2]";
	String bad = "xpath=//*[@id=\"597187964_3931970062_label\"]/span[2]";
	String btn = "xpath=//*[@id=\"patas\"]/main/article/section/form/div[2]/button";
	String text = "xpath=//*[@id=\"patas\"]/main/article/section/div[3]/div";

	public void getRespond(String respond) {
		switch(respond) {
		case "Good":
			click(good);
			break;
		case "Okay":
			click(okay);
			break;
		case "Bad":
			click(bad);
			break;
		}			
	}

	public void clickNext() {
		click(btn);
	}

	public String text() {
		return getText(text);
	}
}
