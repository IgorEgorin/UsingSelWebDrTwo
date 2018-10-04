package ru.TestClassesForRunning;

import org.junit.Test;
import ru.helperpackage.BaseTest;

public class SearchMercedesSUVcar extends BaseTest {


    @Test
    public void searchQueryMersGleCoupe() throws Exception{


        pageMercedes.openUrlCarsMercedesAll();

        pageMain.pushButtonNewCarInSearchBar()
                .typePriceMinAndMax("3200000","5100000" )
                .pushButtonSearchCarByParameters();

        pageMercedes.openUrlCarsMercedesAll();


//        pageMercedes.waitWhenListOfMercedesWillBeLoad();



    }
}
