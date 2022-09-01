package encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);
        System.out.println(cat.isDogNear(dog));
        System.out.println(dog.isCatNear(cat));
    }

}
