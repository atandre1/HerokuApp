import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void tablesTest() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String value = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getAttribute("innerText");
        assertEquals(value, "Smith", "The name is incorrect");
        String value2 = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getAttribute("innerText");
        assertEquals(value2, "John", "The last name is incorrect");
        String value3 = driver.findElement(By.xpath("//table//tr[1]//td[3]")).getAttribute("innerText");
        assertEquals(value3, "jsmith@gmail.com", "The email is incorrect");
        String value4 = driver.findElement(By.xpath("//table//tr[1]//td[4]")).getAttribute("innerText");
        assertEquals(value4, "$50.00", "The price is incorrect");
        String value5 = driver.findElement(By.xpath("//table//tr[1]//td[5]")).getAttribute("innerText");
        assertEquals(value5, "http://www.jsmith.com", "The website is incorrect");
        String value6 = driver.findElement(By.xpath("//table//tr[3]//td[2]")).getAttribute("innerText");
        assertEquals(value6, "Jason", "The last name is incorrect");
    }
}