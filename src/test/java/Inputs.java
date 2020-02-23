import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Inputs {
    @Test
    public void inputsDate(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/inputs");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element=browser.findElement(By.xpath("//*[@type='number']"));
        element.sendKeys(Keys.ARROW_UP,Keys.ARROW_DOWN );
        String value = element.getAttribute("value");
        Assert.assertEquals(value,"0","Неверное значение");
        browser.quit();
    }
}
