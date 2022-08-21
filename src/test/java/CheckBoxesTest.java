import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {

      /*
        1. ������� ������
        2. Assert
        3. �������� ������ �������
        4. Assert ������ �������
        5. Assert ������ �������
        6. ����� ������� � ������� ��������
        7. ������
        */

    @Test
    public void checkBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List <WebElement> list = driver.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse(list.get(0).isSelected(), "Element 1 is selected");
        list.get(0).click();
        assertTrue(list.get(0).isSelected(), "Element 1 is not selected");
        assertTrue(list.get(0).isSelected(), "Element 2 is not selected");
        list.get(1).click();
        assertFalse(list.get(1).isSelected(), "���-���� checkbox 1 ������");
    }
}