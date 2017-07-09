package new27_06;

/**
 * Created by Вождь on 28.06.2017.
 */
public class Dog {
    private String name;
    private String breed;
    private int age;

    public enum Breed{
        Pug, Labrador, Rottweiler, Poodle, Dachshund
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void compareName(Dog dog){
        if (this.getName().equals(dog.getName()))
            System.out.println(this + " and " + dog + " has the same name");
    }

    public Dog compareAge(Dog dog){
        if(this.getAge() > dog.getAge())
            return this;
        else return dog;
    }

    @Override
    public String toString() {
        return "Dog " + name + " " + breed ;
    }
}
