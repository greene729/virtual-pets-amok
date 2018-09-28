package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicPetsTest {

	@Test
	public void shouldGetHunger() {
		OrganicPet underTest = new OrganicPet("", "", 1);
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

}