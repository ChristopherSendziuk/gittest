public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie (){
        System.out.println("nazywam sie " + imie + " " + nazwisko);
    }

    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu to : " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Moj email to : " + email);
    }
}
