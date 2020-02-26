import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxes {
    @Test
    public void Box(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/checkboxes");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element1=browser.findElement(By.xpath("//*[@type='checkbox']"));
        boolean isSelect=element1.isSelected();
        Assert.assertFalse(isSelect,"1 Element is checked");
        element1.click();
        isSelect=element1.isSelected();
        assertTrue(isSelect,"1 Element is unchecked");
        List<WebElement> checkboxes= browser.findElements(By.xpath("//*[@type='checkbox']"));
        WebElement element2=checkboxes.get(1);
        isSelect=element2.isSelected();
        assertTrue(isSelect, "2-element is unchecked");
        element2.click();
        assertTrue(isSelect,"2 Element is checked");

        browser.quit();

    }
}
