import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {

      /*
        1. Открыть ссылку
        2. Assert
        3. Отметить первый чекбокс
        4. Assert первый чекбокс
        5. Assert второй чекбокс
        6. Снять отметку с второго чекбокса
        7. Ассерт
        */

    @Test
    public void checkBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement element = driver.findElement(By.cssSelector("[type=checkbox]"));
        boolean isSelected = element.isSelected();
        assertFalse(isSelected, "Element is selected");
        element.click();
        //Select checkBox = new Select(element);
        //checkBox.selectByIndex(1);
        boolean isSelected2 = element.isSelected();
        assertTrue(isSelected2, "Element is not selected");

        // Пока не разобрался как перейти ко второму элементу и работать с ним. Нужен лист?
    }
}
