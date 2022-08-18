import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

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
        WebElement element = driver.findElement(By.cssSelector("[type=checkbox]"));
        boolean isSelected = element.isSelected();
        assertFalse(isSelected, "Element is selected");
        element.click();
        //Select checkBox = new Select(element);
        //checkBox.selectByIndex(1);
        boolean isSelected2 = element.isSelected();
        assertTrue(isSelected2, "Element is not selected");

        // ���� �� ���������� ��� ������� �� ������� �������� � �������� � ���. ����� ����?
    }
}
