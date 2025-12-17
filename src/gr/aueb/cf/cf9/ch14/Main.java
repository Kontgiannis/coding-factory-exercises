package gr.aueb.cf.cf9.ch14;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog", 18);
        Animal cat = new Cat("Cat", 30);
        System.out.println(dog);
        System.out.println(cat);
        dog.speak();
        cat.speak();
    }
    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
