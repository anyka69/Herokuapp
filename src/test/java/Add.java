import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Add {
    @Test
    public void AddRemoveElement(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver browser= new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement elementAdd = browser.findElement(By.xpath("//*[@onclick='addElement()']"));
        elementAdd.click();
        elementAdd.click();

        WebElement elementDelete = browser.findElement(By.className("added-manually"));
        elementDelete.click();

        int Buttons = browser.findElements(By.xpath("//*[@onclick='deleteElement()']")).size();
        assertEquals(Buttons,1,"Error");

        browser.quit();

    }
}
