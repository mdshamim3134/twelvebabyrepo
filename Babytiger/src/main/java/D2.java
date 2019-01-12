import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class D2 {
	WebDriver dr;
	public void mouseOver(By by) {
		Actions mouse=new Actions(dr);
		mouse.moveToElement(dr.findElement(by)).build().perform();
		
	}
	public void Dropdown(By by,String text) {
		Select select=new Select(dr.findElement(by));
		select.selectByVisibleText(text);
		
	}
	public List<WebElement> Elements(By by) {
		return dr.findElements(by);
	}
	public void listele(By by) {
		dr.findElements(by);
	}

}
