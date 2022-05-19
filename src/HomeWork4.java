public class HomeWork4 {

    public static void main(String[] args) {

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Kowalski";
        adam.nick = "Adas";
        adam.email = "Adam.Kowalski@gmail.com";
        adam.numerIndeksu = 12345;

        adam.przedstawSie();
        adam.podajEmail();
        adam.podajNrIndeksu();

        Student Kasia = new Student();
        Kasia.imie = "Kasia";
        Kasia.nazwisko = "Nowak";
        Kasia.nick = "Kasiulka";
        Kasia.email = "Kasia.Nowak@gmail.com";
        Kasia.numerIndeksu = 85647;

        Kasia.przedstawSie();
        Kasia.podajEmail();
        Kasia.podajNrIndeksu();

        Student krzysztof = new Student();
        krzysztof.imie = "Krzysztof";
        krzysztof.nazwisko = "Sendziuk";
        krzysztof.nick = "Rychu";
        krzysztof.email = "Krzysztof.sendziuk@gmial.com";
        krzysztof.numerIndeksu = 598964;

        krzysztof.przedstawSie();
        krzysztof.podajEmail();
        krzysztof.podajNrIndeksu();
    }
}
