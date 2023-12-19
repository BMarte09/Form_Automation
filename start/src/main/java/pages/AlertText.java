package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertText {
    public static  void getAlerBannerText(WebDriver driver){
//        return driver.findElement(By.className("alert")).getText();
//        driver.getTitle();
        WebElement e = driver.findElement(By.className("alert"));
        System.out.println(e.getText());

    }
}
