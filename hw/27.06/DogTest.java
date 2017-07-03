package new27_06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Вождь on 28.06.2017.
 */
public class DogTest {

    Dog dog = new Dog("Jek", Dog.Breed.Labrador,2);
    Dog dog2 = new Dog("Pit", Dog.Breed.Poodle,8);

    @Test
    public void compareName() throws Exception {
        assertEquals(false, dog.compareName(dog2));
    }

    @Test
    public void compareAge() throws Exception {
        assertSame(dog2,dog.compareAge(dog2));
    }
}