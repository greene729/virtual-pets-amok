package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DogTest {

	@Test
	public void shouldGetWaste() {
		Dog underTest = new Dog("", "");
		int result = underTest.getWaste();
		assertEquals(0, result);
	}

	@Test
	public void shouldPoop() {
		Dog underTest = new Dog("", "");
		underTest.poop();
		int result = underTest.getWaste();
		assertEquals(1, result);
	}

	@Test
	public void shouldCountTurnsSincePoop() {
		Dog underTest = new Dog("", "");
		underTest.dogTick();
		int result = underTest.getTicksSincePoop();
		assertEquals(1, result);
	}

	@Test
	public void shouldPoopEveryFiveTurns() {
		Dog underTest = new Dog("", "");
		underTest.dogTick();
		underTest.dogTick();
		underTest.dogTick();
		underTest.dogTick();
		underTest.dogTick();
		int result = underTest.getWaste();
		assertEquals(1, result);
	}

	@Test
	public void shouldResetPoopTimerAfterPoop() {
		Dog underTest = new Dog("", "", 4, 1);
		underTest.dogTick();
		int result = underTest.getTicksSincePoop();
		assertEquals(0, result);
	}

	@Test
	public void shouldResetPoopTimerAfterWalk() {
		Dog underTest = new Dog("", "", 4, 1);
		underTest.walk();
		int result = underTest.getTicksSincePoop();
		assertEquals(0, result);
	}

	@Test
	public void excessiveDamageShouldReduceHealthByTen() {
		Dog underTest = new Dog("", "", 4, 10);
		underTest.dogTick();
		int result = underTest.getHealth();
		assertEquals(90, result);
	}

}