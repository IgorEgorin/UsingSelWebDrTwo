package ru.TestClassesForRunning;

import org.junit.Test;
import ru.PagesClasses.PageMain;
import ru.PagesClasses.PageMercedes;
import ru.helperpackage.BaseTest;

public class SearchMercedesSUVcar extends BaseTest {


    @Test
    public void searchQueryMersGleCoupe() {
        PageMercedes pageMercedes = new PageMercedes(driver);
        PageMain pageMain = new PageMain(driver);

        pageMain.openURLMainPageSpb()
                .pushLinkBrandMercedesBenz()
                .pushLinkInSearchBarShowAllCars();

        pageMercedes.clickOnLinkGLEcoupe();

        pageMain.pushButtonNewCarInSearchBar()
                .typePriceMinAndMax("3200000","5100000" )
                .pushButtonSearchCarByParameters();


        pageMercedes.waitWhenListOfMercedesWillBeLoad();



    }
}
