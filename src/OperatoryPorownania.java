import java.util.Scanner;

// porownuja elementy rowniania i zwracaja logiczna wartosc (true/false)
public class OperatoryPorownania {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze, podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Prosze, podaj druga liczbe");
        int secondNumber = scanner.nextInt();*/

        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber > firstNumber; // true

        System.out.println(result);
        System.out.println(firstNumber > secondNumber); //false
        System.out.println(firstNumber < secondNumber); //true
        System.out.println(firstNumber >= secondNumber); //false
        System.out.println(firstNumber <= secondNumber); //true
        System.out.println(firstNumber == secondNumber); //false
        System.out.println(firstNumber != secondNumber); //true
    }
}
