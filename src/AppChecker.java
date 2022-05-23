public class AppChecker {

    public static void main(String[] args) {
        androidApp androidApp = new androidApp("Calculator");
        androidApp.appInfo();
        androidApp.runAdroidApp();

        iphoneApp iphoneApp = new iphoneApp("Calculator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
