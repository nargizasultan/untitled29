package peaksoft;

public class Main {

    public static void main(String[] args) {
        method(new Cat());
        method(new Dog());

    }
    public static  void method(DomesticAnimal animal){
        animal.voice();
    }
}
