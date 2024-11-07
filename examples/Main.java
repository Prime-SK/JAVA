package examples;


public class Main {
    public static void main(String[] args) {
        dog tommy = new dog();
        dog browny = new dog();

        tommy.name = "Tommy";
        browny.name = "Browny";

        tommy.eat();
        browny.sleep();

        Student shakila = new Student();
        Student thathsra = new Student();

        shakila.name = "Shakila";
        shakila.age = 23;

        thathsra.name = "Thathsara";
        thathsra.age = 23;

        thathsra.learning();
        shakila.speaking();

    }
}
