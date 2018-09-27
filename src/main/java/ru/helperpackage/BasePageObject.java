package ru.helperpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject<T> {

    protected WebDriverWait wait;
    protected WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    protected T getPage (String url){
        driver.get(url);
        return (T) this;
    }

    protected void typeIntoField(String text, By pathToElement) {
        find(pathToElement).sendKeys(text);
    }

    private WebElement find(By pathToElement) {
        return driver.findElement(pathToElement);
    }

    protected void click(By pathToElementClick) {
        find(pathToElementClick).click();
    }

    protected void waitingVisibilityOfElement(By pathToElement, Integer... timeSeconds) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                waitForElement(ExpectedConditions.visibilityOfElementLocated(pathToElement)
                        , (timeSeconds.length > 0 ? timeSeconds[0] : null));
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }

        }
    }

    private void waitForElement(ExpectedCondition<WebElement> condition, Integer timeInSeconds) {
        timeInSeconds = timeInSeconds != null ? timeInSeconds : 10;
        WebDriverWait wait = new WebDriverWait(driver,timeInSeconds );
        wait.until(condition);
    }
}
