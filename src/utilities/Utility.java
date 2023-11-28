package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    //Method to click on Element
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //Method to send text to Element
    public void sendTextToElement( By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //Method to get text from Element
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //************************* Alert Methods *****************************************************
    //Method will switch to alert
    public void switchToAlert()
    {
        driver.switchTo().alert();
    }
    //Method to accept alert
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    //Method to dismiss alert
    public void dismissAlert()
    {

        driver.switchTo().alert().dismiss();
    }
    //Method to get text from alert
    public String  getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    //*************************** Select Class Methods ***************************************//
    //Method to select value from Dropdown
    public void selectByValueFromDropDown(By by,String value)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown);
        s1.selectByValue(value);
    }
    //Method to select by visible text from Drop down
    public void selectByVisibleTextFromDropDown(By by, String text)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown);
        s1.selectByVisibleText(text);
    }
    //Method to select index from drop down
    public void selectByIndexFromDropDown(By by, int index)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown);
        s1.selectByIndex(index);
    }

    //*************************** Action Methods ***************************************//

    //Method to mouse hover on element

    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
}





