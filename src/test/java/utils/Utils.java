package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import test.BaseTest;


public class Utils extends BaseTest {
   /*public static void tableParsing(By table){

       WebElement tableEl=driver.findElement(table);
       List<String> result = new ArrayList<String>();
       By by =By.tagName("tr");
       List<WebElement> trs = tableEl.findElements(by);
       for (WebElement tr:trs) {
           result.add(createTable(tr));
       }

   }
    private static String createTable(WebElement tr){
        List<WebElement> tds = tr.findElements(By.tagName("td"));
        String result=tds.get(1).getText();

        return result;
    }*/

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG () {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
