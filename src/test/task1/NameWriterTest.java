package task1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NameWriterTest {
	
	@Test
	public void nameTest() {
		NameWriter nameWriter=new NameWriter("Polina");
		assertEquals(nameWriter.writeName(), "Polina");
	}

}
