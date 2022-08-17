import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest extends BaseTest {

    /*
    1. открыть ссылку
    2. кликнуть ADD Element
    3. кликнуть ADD Element
    4. нажать Delete
    5. Assert
     */

    @Test
    public void addRemoveElement() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElements(By.xpath("//button[text()='Delete']")).get(1).click();
        int deleteButtons = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        assertEquals(deleteButtons, 1, "Number of Delete buttons is wrong");

    }


}
