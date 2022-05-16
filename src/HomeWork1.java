import java.util.Scanner;

public class HomeWork1 {

    //napisz program ktory poprosi uzytkownika o 2 liczby , a nastepnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik Dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnozenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + mod);


    }
}
