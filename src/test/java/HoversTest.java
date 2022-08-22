import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hoversTest() {
        driver.get(URL + "hovers");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(""));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath(""))).click().build().perform();

        // пока не разобрался
    }
}
