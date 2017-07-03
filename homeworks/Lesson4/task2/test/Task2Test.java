package homework.task2.test;

import static org.junit.Assert.*;
import org.junit.Test;
import homework.task2.*;


public class Task2Test {
	Dog dog = new Dog("Brovko", Breed.Streetdog,6);
	Dog diffdog = new Dog("Sharik", Breed.Sheepdog,3);
	@Test
	public void testSameName() {
		assertTrue(dog.sameName(dog));
		assertFalse(dog.sameName(diffdog));
	}
	@Test
	public void testOlder() {
		assertTrue(dog.older(diffdog));
		assertFalse(dog.older(dog));
	}
	@Test
	public void testNameAndBreed() {
		assertEquals(dog.nameAndBreed(),"name is Brovko, and his breed is the Streetdog");
	}

}
