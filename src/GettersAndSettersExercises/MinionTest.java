package GettersAndSettersExercises;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.StubNotFoundException;

import org.junit.jupiter.api.Test;

public class MinionTest {

	@Test
	void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "Yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("Yellow", stuart.getColor());
		
		Minion dave = new Minion("Dave", 2, "Yellow", "");
		assertEquals("Dave", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("Yellow", dave.getColor());
	}
	
	@Test
	void testSetters() {
		
		Minion stuart = new Minion("Stuart", 1, "Yellow", "");
		stuart.setMaster("Wolf");
		assertEquals("Wolf", stuart.getMaster());
		
		stuart.setMaster("Gru");
		assertEquals("Gru", stuart.getMaster());
		
	}
}
