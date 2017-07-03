package new30_06;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[5];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Dog();
        animal[3] = new Dog();
        animal[4] = new Cat();

        for (Animal a: animal){
            a.voice();
            a.feed();
        }
    }
}
