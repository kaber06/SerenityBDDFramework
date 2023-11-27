package pages;

import java.util.ArrayList;
import java.util.List;

import base.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;

public class QaTestPage extends BasePage {

	public ArrayList<String> list = new ArrayList<String>();
	//String labels = "tag=//label/span[2]";
	String good = "xpath=//*[@id=\"597187964_3931970060_label\"]/span[2]";
	String btn = "xpath=//*[@id=\"patas\"]/main/article/section/form/div[2]/button";
	String text = "xpath=//*[@id=\"patas\"]/main/article/section/div[3]/div";

	public void getRespond() {
		click(good);
		//List<WebElementFacade> responds = getElements(labels);
		//WebElementFacade element = null;
		//for (WebElementFacade label : responds) {						
			//if (label.containsText(respond)) {	
				//element = label;
				//element.click();
				//break;
			//}
		//}
	}

	public void clickNext() {
		click(btn);
	}

	public String text() {
		return getText(text);
	}
}
