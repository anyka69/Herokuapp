import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown {
    @Test
    public void dropdownClick(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/dropdown");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select select = new Select(browser.findElement(By.id("dropdown")));
        select.selectByIndex(1);
        String selectValue = select.getFirstSelectedOption().getAttribute("innerText");
        Assert.assertEquals(selectValue,"Option 1","Ошибка выбора");
        select.selectByIndex(2);
        selectValue=select.getFirstSelectedOption().getAttribute("innerText");
        Assert.assertEquals(selectValue,"Option 2","Ошибка выбора");
        browser.quit();
    }
}
