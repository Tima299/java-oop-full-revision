package sg.edu.ntu.chapterFour.fourSix;

public class TestMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        dog.greets();
        cat.greets();
        dog.greets();
        cat.greets();
        System.out.println(dog);
        System.out.println(cat);

        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        dog1.greets(dog2);

        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal);

        Animal animal = new Animal("Animal");
        System.out.println(animal);

        Cat cat1 = new Cat("Cat1");
        cat1.greets();
        System.out.println(cat1);

        Mammal mammal1 = new Mammal("Mammal1");
        System.out.println(mammal1);

        Animal animal1 = new Animal("Animal1");
        System.out.println(animal1);
    }
}
