package sg.edu.ntu.chapterSix.sixSix;

public class TestMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Dog1");
        animals[1] = new Cat("Cat1");
        animals[2] = new BigDog("BigDog1");
        animals[3] = new Animal("Animal1") {
            @Override
            public void greets() {
                System.out.println("I am an animal");
            }
        };
        for (Animal a : animals) {
            a.greets();
        }

        Dog dog = new Dog("Dog2");
        BigDog bigDog = new BigDog("BigDog2");
        dog.greets(bigDog);
        bigDog.greets(dog);
        bigDog.greets(bigDog);
    }
}
