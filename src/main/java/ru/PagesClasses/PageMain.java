package ru.PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.helperpackage.BasePageObject;

public class PageMain extends BasePageObject<PageMain> {


    private String URLMainPageSpb = "https://auto.ru/sankt-peterburg/";
    private By fieldMinPrice = By.name("price_from");
    private By fieldMaxPrice = By.name("price_to");
    private By submitButton = By.className("ButtonWithLoader__content");
    private By buttonNewCarInSearchBar = By.xpath("//span[@class=\"Button__text\" and contains (text(), 'Новые')]");
    private By linkBrandMercedesBenz = By.xpath("//div[@class=\"IndexMarks__item-name\" and contains (text(), 'Mercedes-Benz')]");
    private By linkInSearchBarShowAllCars = By.cssSelector("[class=\"ListingPopularMMM-module__container PageListingCars-module__popularMMM\"] [class=\"Link\"]");

    public PageMain(WebDriver driver) {
        super(driver);
    }


    public PageMain openURLMainPageSpb(){

        System.out.println("\nOpen URL" + URLMainPageSpb);
        getPage(URLMainPageSpb);
        return new PageMain(driver);
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

    public PageMain pushLinkBrandMercedesBenz() {
        System.out.println("\nClick on link 'Mercedes-Benz' on main page");
        click(linkBrandMercedesBenz);
        return new PageMain(driver);
    }

    public PageMain pushLinkInSearchBarShowAllCars() {
        System.out.println("\nClick on link 'Show all cars' in search bar");
        click(linkInSearchBarShowAllCars);
        return new PageMain(driver);
    }
}
