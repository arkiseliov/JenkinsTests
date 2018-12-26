package by.bsu.kiselev.tests;

import by.bsu.kiselev.driver.DriverProvider;
import by.bsu.kiselev.page.HomePage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RouteMapVisabilityTest {
    private static final String SuccesURL="http://www.jal.co.jp/en/inter/";
    private HomePage flightsSearch = new HomePage();

    @BeforeClass
    public static void setup() {
        DriverProvider.getDriver().get("http://www.jal.co.jp/en/");
    }

    @Test
    public void testViewRouteMap() {
        flightsSearch.viewRouteMap();
        DriverProvider.getCurrentUrl();
        Assert.assertEquals(DriverProvider.getCurrentUrl(),SuccesURL);
    }

    @AfterClass
    public static void tearDown() {
        DriverProvider.closeDriver();
    }
}
