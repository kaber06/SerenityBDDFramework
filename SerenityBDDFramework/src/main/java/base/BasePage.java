package base;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject{
	
	public WebElementFacade getElement(String locator) {

		try {
			return find(getBy(locator));
		} catch (NoSuchElementException e) {

			e.getMessage();

		}

		return null;
	}

	public List<WebElementFacade> getElements(String locator) {

		try {

			return findAll(getBy(locator));

		} catch (NoSuchElementException e) {

			e.getMessage();

		}

		return null;
	}

	private By getBy(String locator) {
		By by = null;
		try {
			if (locator.startsWith("id=")) {

				locator = locator.substring(3);
				by = By.id(locator);
			} else if (locator.startsWith("xpath=")) {

				locator = locator.substring(6);
				by = By.xpath(locator);
			} else if (locator.startsWith("css=")) {

				locator = locator.substring(4);
				by = By.cssSelector(locator);
			} else if (locator.startsWith("name=")) {

				locator = locator.substring(5);
				by = By.name(locator);
			} else if (locator.startsWith("link=")) {

				locator = locator.substring(5);
				by = By.linkText(locator);
				
			} else if(locator.startsWith("tag=")) {
				locator = locator.substring(4);
				by = By.tagName(locator);
			}
			return by;

		} catch (Throwable t) {

			t.getMessage();
		}

		return null;
	}

	public void click(String locator) {

		waitFor(getElement(locator)).click();
	}


	public String getText(String locator) {

		return waitFor(getElement(locator)).getText();
	}


	
	
}
