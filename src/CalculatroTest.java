import java.util.Scanner;

public class CalculatroTest {

    //napisz program ktory poprosi uzytkownika o 2 liczby , a nastepnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        int addition = calculator.add(firstNumber,secondNumber);
        int subtraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.multi(firstNumber,secondNumber);
        int division = calculator.division(firstNumber,secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);

        System.out.println("Wynik Dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnozenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + mod);


    }
}
