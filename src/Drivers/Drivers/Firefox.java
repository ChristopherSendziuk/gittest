package Drivers.Drivers;

public class Firefox implements webDrivers{
    @Override
    public void get() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Search element in Firefox");

    }
}
