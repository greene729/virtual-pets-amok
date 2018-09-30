package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest {

	@Test
	public void shouldGetWaste() {
		Cat underTest = new Cat("", "");
		int result = underTest.getWaste();
		assertEquals(0, result);
	}

	@Test
	public void shouldPoop() {
		Cat underTest = new Cat("", "");
		underTest.poop();
		int result = underTest.getWaste();
		assertEquals(1, result);
	}

	@Test
	public void shouldPoopCollectively() {
		Cat underTest = new Cat("", "");
		Cat underTestToo = new Cat("a", "");
		underTest.poop();
		int result = underTestToo.getWaste();
		assertEquals(1, result);
	}

	@Test
	public void shouldCountTurnsSincePoop() {
		Cat underTest = new Cat("", "");
		underTest.catTick();
		int result = underTest.getTicksSincePoop();
		assertEquals(1, result);
	}

	@Test
	public void shouldPoopEveryFiveTurns() {
		Cat underTest = new Cat("", "");
		underTest.catTick();
		underTest.catTick();
		underTest.catTick();
		underTest.catTick();
		underTest.catTick();
		int result = underTest.getWaste();
		assertEquals(1, result);
	}

}
