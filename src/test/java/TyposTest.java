import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class TyposTest extends BaseTest {

    @Test
    public void typo() {
        driver.get("http://the-internet.herokuapp.com/typos");
        List<WebElement> list = driver.findElements(By.tagName("p"));
        assertEquals(list.get(1).getText(), "Sometimes you'll see a typo, other times you won't.",
                "There is a mistake in text");
    }
}
