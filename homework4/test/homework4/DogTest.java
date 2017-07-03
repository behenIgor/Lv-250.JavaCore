package homework4;

import static org.junit.Assert.*;
import org.junit.Test;
import com.edu.homework4.Dog;

public class DogTest {

	Dog dog = new Dog();
	
	@Test
	public void testSetBreed() {
		dog.setBreed("bulldog");
		assertTrue(dog.getBreed() == "Bulldog");
		dog.setBreed("SomeOtherBreed");
		assertTrue(dog.getBreed() == "Unidentified");
	}

}
