import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessage() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.linkText("Click here")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean actualResult = driver.findElement(By.xpath("//div[@class='flash notice']")).isDisplayed();
        assertTrue(actualResult, "There is no message");
    }
}
