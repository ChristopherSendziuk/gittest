public class mathTeacher extends Person {

    public String school;

    public mathTeacher(String name, int age,String school) {
        super(name, age);
        System.out.println(" Jestem w konstruktorze mathTeacher");
        this.school = school;
    }

    public void walk(){
        super.walk();
        System.out.println("I walk very fast!");
    }

    public void teachMath() {

        System.out.println(" I am teaching math!");
    }

    public void sayHello(){
        System.out.println("Hello my name is: " + name);
        System.out.println("I am " + age);
    }


}
