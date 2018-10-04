package ru.PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.helperpackage.BasePageObject;

public class PageMain extends BasePageObject<PageMain> {


    private By fieldMinPrice = By.name("price_from");
    private By fieldMaxPrice = By.name("price_to");
    private By submitButton = By.className("ButtonWithLoader__content");
    private By buttonNewCarInSearchBar = By.xpath("//span[@class=\"Button__text\" and contains (text(), 'Новые')]");

    public PageMain(WebDriver driver) {
        super(driver);
    }

    public PageMain pushButtonNewCarInSearchBar() {
        System.out.println("\nPush button 'New car' in search bar");
        click(buttonNewCarInSearchBar);
        return new PageMain(driver);
    }

    public PageMain typePriceMinAndMax (String prMin, String prMax) {
        System.out.println("\nEnter price: " + " " + "\nMin price is " + " " + prMin
                + "\nMax price is " + prMax);
        typeIntoField(prMin, fieldMinPrice);
        typeIntoField(prMax, fieldMaxPrice);
        return new PageMain(driver);
    }

    public PageMain pushButtonSearchCarByParameters() {
        System.out.println("\nClick on button 'Search' in search bar");
        click(submitButton);
        return new PageMain(driver);
    }
}
