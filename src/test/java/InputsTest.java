import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String number = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(number, "1", "Actual result is wrong (Arrow up)");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String number2 = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(number2, "-1", "Actual result is wrong (Arrow down)");
    }
}
