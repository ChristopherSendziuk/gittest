import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int wiek = scanner.nextInt();
        if (wiek < 18) {
        System.out.println(" Nie mozesz kupic alkoholu");
    } else  {
        System.out.println("Dziekuje za zakupy!");
    }
    }
}
