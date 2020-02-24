import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SortableDateTables {
    @Test
    public void SortableDate (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://the-internet.herokuapp.com/tables#edit");
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> elements= browser.findElements(By.id("table1"));
        for(WebElement element:elements){
            assertEquals(elements.get(0).getText(),"Last Name", "Error");
            assertEquals(elements.get(1).getText(),"First Name");
            assertEquals(elements.get(2).getText(),"Email");
            assertEquals(elements.get(3).getText(),"Due");
            assertEquals(elements.get(4).getText(),"Web Site");
            assertEquals(elements.get(5).getText(),"Action");
        }
        List<WebElement> smith= browser.findElements(By.xpath("//tbody/tr[1]/td"));
        for(WebElement element:smith) {
            assertEquals(smith.get(0).getText(), "Smith");
            assertEquals(smith.get(1).getText(), "John");
            assertEquals(smith.get(2).getText(), "jsmith@gmail.com");
            assertEquals(smith.get(3).getText(), "$50.00");
            assertEquals(smith.get(4).getText(), "http://www.jsmith.com");
            assertEquals(smith.get(5).getText(), "edit delete");
        }
        List<WebElement> bach= browser.findElements(By.xpath("//tbody/tr[2]/td"));
        for(WebElement element:bach) {
            assertEquals(bach.get(0).getText(), "Bach");
            assertEquals(bach.get(1).getText(), "Frank");
            assertEquals(bach.get(2).getText(), "fbach@yahoo.com");
            assertEquals(bach.get(3).getText(), "$51.00");
            assertEquals(bach.get(4).getText(), "http://www.frank.com");
            assertEquals(bach.get(5).getText(), "edit delete");
        }
        List<WebElement> doe= browser.findElements(By.xpath("//tbody/tr[3]/td"));
        for(WebElement element:doe) {
            assertEquals(doe.get(0).getText(), "Doe");
            assertEquals(doe.get(1).getText(), "Jason");
            assertEquals(doe.get(2).getText(), "jdoe@hotmail.com");
            assertEquals(doe.get(3).getText(), "$100.00");
            assertEquals(doe.get(4).getText(), "http://www.jdoe.com");
            assertEquals(doe.get(5).getText(), "edit delete");
        }
        List<WebElement> conway= browser.findElements(By.xpath("//tbody/tr[4]/td"));
        for(WebElement element:conway) {
            assertEquals(conway.get(0).getText(), "Conway");
            assertEquals(conway.get(1).getText(), "Tim");
            assertEquals(conway.get(2).getText(), "tconway@earthlink.net");
            assertEquals(conway.get(3).getText(), "$50.00");
            assertEquals(conway.get(4).getText(), "http://www.timconway.com");
            assertEquals(conway.get(5).getText(), "edit delete");
        }
        browser.quit();
    }
}
