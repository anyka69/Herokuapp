import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Notifications {
    @Test
    public void NotificationMessage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement element=browser.findElement(By.xpath("//*[@href='/notification_message']"));
        element.click();
        String message= browser.findElement(By.id("flash")).getText();
        Assert.assertEquals(message,"Action successful\n" +
                "×","Error");
        browser.quit();
    }
}
