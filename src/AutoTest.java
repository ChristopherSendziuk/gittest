public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes","Klasa S",2021,100);


        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        Auto audi = new Auto("Audi","A5",2020,0);


        audi.hamuj();
        audi.jedz();
        audi.info();

        Auto noName = new Auto(null,null,0,0);

        noName.jedz();
        noName.hamuj();
        noName.info();


    }
}
