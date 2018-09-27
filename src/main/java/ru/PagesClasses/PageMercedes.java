package ru.PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.helperpackage.BasePageObject;

public class PageMercedes extends BasePageObject<PageMercedes> {

    private String URL = "https://auto.ru/sankt-peterburg/cars/mercedes/all/";
    private By listOfMercedesAfterLoading = By.xpath("//div[@class=\"ListingCars-module__container ListingCars-module__list\"]");
    private By linkMercedesGLEcoupe = By.xpath("//a[@class=\"Link ListingPopularMMM-module__itemName\" and contains (text(), 'GLE Coupe')]");

    private Integer waitingTimeToLoad = 15;



    public PageMercedes(WebDriver driver){
        super(driver);
    }

    public PageMercedes openUrlCarsMercedesAll(){

        System.out.println("\nOpen URL" + URL);
        getPage(URL);
        return new PageMercedes(driver);
    }


    public PageMercedes waitWhenListOfMercedesWillBeLoad() {
        System.out.println("\nWaiting for 15 seconds to load a list of Mercedes cars");
        waitingVisibilityOfElement(listOfMercedesAfterLoading,waitingTimeToLoad);
        return new PageMercedes(driver);
    }

    public PageMercedes clickOnLinkGLEcoupe() {
        System.out.println("\nClick on link GLE coupe");
        click(linkMercedesGLEcoupe);
        return new PageMercedes(driver);
    }



}
