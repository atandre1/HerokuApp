import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typo() {
        driver.get("http://the-internet.herokuapp.com/typos");
        String actualResult = driver.findElement(By.tagName("p")).getText();
        assertEquals(actualResult, "Sometimes you'll see a typo, other times you won't.",
                "There is a mistake");

        // Пока не разобрался, как перейти ко второму тегу. Нужен лист?
    }
}
