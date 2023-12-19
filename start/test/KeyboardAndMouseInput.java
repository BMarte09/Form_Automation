//import org.apache.xpath.operations.String;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AlertText;
import pages.Form;
import pages.Alert;

import java.awt.*;

public class KeyboardAndMouseInput {

    
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bmm93\\OneDrive\\Desktop\\chromedriver-Dec-2023\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        Form formPage = new Form();
        formPage.submitForm(driver);

        Alert alerMessage = new Alert();
        alerMessage.Alertbarner( driver);

        AlertText alertText = new AlertText();
        alertText.getAlerBannerText(driver);


    }



}
