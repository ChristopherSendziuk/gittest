import java.util.TooManyListenersException;

public class PersonTest {

    public static void main(String[] args) {
        mathTeacher teacher = new mathTeacher("Tom",29,"University");
        teacher.walk();
        teacher.eat();
       // teacher.teachMath();
        //teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21,"Boca Juniors");
        footballer.eat();
        footballer.walk();
        //footballer.playFootball();
    }
}
