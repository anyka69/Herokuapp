import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HTML {
    @Test
    public void checkHTML(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver browser= new ChromeDriver();
        browser.get("C:\\Users\\Юра\\IdeaProjects\\Herokuapp\\Exercise.html ");
        browser.findElement(By.xpath("/html/body/h2[1]"));
        browser.findElement(By.xpath("/html/body/h2[2]"));
        browser.findElement(By.id("cars"));
        browser.findElement(By.xpath("/html/body/button")).click();
        browser.quit();

    }
}
