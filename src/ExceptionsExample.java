import Drivers.Drivers.Chromedriver;
import Drivers.Drivers.Firefox;
import Drivers.Drivers.webDrivers;

public class ExceptionsExample {

    public static void main(String[] args) {

        /*int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i=0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }
*/
        webDrivers driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
    }
    private static webDrivers getDriver(String name) {

        if (name.equals("chrome")) {
            return new Chromedriver();

        } else if (name.equals("firefox")) {
            return new Firefox();
        }
        return null;
    }
}
