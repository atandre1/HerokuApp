import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {


        /*
        1. Открыть ссылку
        2. Выбрать первый элемент
        3. Assert
        4. Выбрать второй элемент
        5. Assert
        */

    @Test
    public void dropDown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText("Option 1");
        boolean isSelected = dropDown.getFirstSelectedOption().isSelected();
        assertTrue(isSelected, "First element is not selected");
        dropDown.selectByVisibleText("Option 2");
        boolean isSelected2 = dropDown.getFirstSelectedOption().isSelected();
        assertTrue(isSelected2, "Second element is not selected");
        int numberOfElements = driver.findElements(By.xpath("//option")).size();
        assertEquals(numberOfElements, 3, "The number of elements in drop-down is wrong");
    }
}
