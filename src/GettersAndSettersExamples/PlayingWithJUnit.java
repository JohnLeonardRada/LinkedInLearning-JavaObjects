package GettersAndSettersExamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlayingWithJUnit {

	@Test
	void testName() throws Exception {
		assertEquals(4, Calculator.add(2, 2));
	}
}
