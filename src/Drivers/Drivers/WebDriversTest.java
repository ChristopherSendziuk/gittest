package Drivers.Drivers;

public class WebDriversTest {
    public static void main(String[] args) throws NoValidBrowserName {
        webDrivers driver = getDriver("firefoxa");
        driver.get();
        driver.findElementBy();

       /* Firefox firefox = new Firefox();
        firefox.get();
        firefox.findElementBy();*/
    }

    private static webDrivers getDriver(String name) throws NoValidBrowserName {

        if(name.equals("chrome")){
            return new Chromedriver();

        } else if (name.equals("firefox")){
            return new Firefox();
        }
        throw new NoValidBrowserName("No valid browser name.");



    }
}
