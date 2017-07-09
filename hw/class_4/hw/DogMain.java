package new27_06;

/**
 * Created by Вождь on 28.06.2017.
 */
public class DogMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Jek","Rottweiler",2);
        Dog dog2 = new Dog("Pit","Poodle",8);
        Dog dog3 = new Dog("Sem","Dachshund",5);

        dog.compareName(dog2);
        dog.compareName(dog3);
        dog2.compareName(dog3);

        System.out.println((dog3.compareAge(dog.compareAge(dog2))) + " the oldest dog");
    }
}
