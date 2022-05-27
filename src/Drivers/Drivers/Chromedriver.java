package Drivers.Drivers;

public class Chromedriver implements webDrivers{
    @Override
    public void get() {
        System.out.println("Using Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Find elements by using Chrome");

    }
}
