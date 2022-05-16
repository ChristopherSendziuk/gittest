public class OperatoryLogiczne {


    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdVealue = false;
        boolean fourtValue = true;

        //&& > true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourtValue); //true
        System.out.println(secondValue && thirdVealue); //false

        // || lub -> true gdy jedno wyrazenie skladowe jest rowne true

        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourtValue); // true
        System.out.println(secondValue || thirdVealue); //false

        // ! negacja - zwraca wartość przeciwna do wyrazenia przed ktorym sie znajduje

        System.out.println(!firstValue); // false
        System.out.println(!thirdVealue); //true
        System.out.println(!(firstValue&&secondValue));





    }
}
