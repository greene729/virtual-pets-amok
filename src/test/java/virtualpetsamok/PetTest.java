package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void shouldGetName() {
		Pet underTest = new OrganicPet("Chooba", "");
		String result = underTest.getName();
		assertEquals("Chooba", result);
	}

	@Test
	public void shouldGetDescription() {
		Pet underTest = new OrganicPet("Hamb", "stinky");
		String result = underTest.getDescription();
		assertEquals("stinky", result);

	}

	@Test
	public void shouldGetHappiness() {
		Pet underTest = new Pet("", "", 1, 100, 1);
		int result = underTest.getHappiness();
		assertEquals(100, result);
	}

	@Test
	public void shouldGetHealth() {
		Pet underTest = new Pet("", "", 100, 1, 1);
		int result = underTest.getHealth();
		assertEquals(100, result);
	}

	@Test
	public void shouldGetBoredom() {
		Pet underTest = new Pet("", "", 1, 1, 100);
		int result = underTest.getBoredom();
		assertEquals(100, result);
	}

	@Test
	public void shouldBeAlive() {
		Pet underTest = new Pet("", "", 1, 1, 1);
		boolean result = underTest.getAlive();
		assertEquals(true, result);
	}

	@Test
	public void shouldBeDead() {
		Pet underTest = new Pet("", "", 0, 1, 1);
		underTest.checkIfDead();
		boolean result = underTest.getAlive();
		assertEquals(false, result);
	}

	@Test
	public void shouldIncreaseHappinessByPlaying() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith();
		int result = underTest.getHappiness();
		assertEquals(3, result);
	}

	@Test
	public void shouldIncreaseHappinessFifteenByPlayingTypeOne() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith(1);
		int result = underTest.getHappiness();
		assertEquals(17, result);
	}

	@Test
	public void shouldIncreaseHappinessThirtyByPlayingTypeTwo() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith(2);
		int result = underTest.getHappiness();
		assertEquals(32, result);
	}

	@Test
	public void shouldIncreaseHappinessFourtyFiveByPlayingTypeThree() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith(3);
		int result = underTest.getHappiness();
		assertEquals(47, result);
	}

	@Test
	public void shouldKillPetByPlayingNonPlayOption() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith(4);
		underTest.checkIfDead();
		boolean result = underTest.getAlive();
		assertEquals(false, result);
	}

	@Test
	public void shouldAlsoDecreaseBoredomeByPlaying() {
		Pet underTest = new Pet("", "", 1, 2, 3);
		underTest.playWith();
		int result = underTest.getBoredom();
		assertEquals(2, result);
	}

	@Test
	public void shouldAlsoDecreaseBoredomeFifteenByPlayingOne() {
		Pet underTest = new Pet("", "", 1, 2, 100);
		underTest.playWith(1);
		int result = underTest.getBoredom();
		assertEquals(85, result);
	}

	@Test
	public void shouldAlsoDecreaseBoredomeThirtyByPlayingTwo() {
		Pet underTest = new Pet("", "", 1, 2, 100);
		underTest.playWith(2);
		int result = underTest.getBoredom();
		assertEquals(70, result);
	}

	@Test
	public void shouldAlsoDecreaseBoredomeFourtyFiveByPlayingThree() {
		Pet underTest = new Pet("", "", 1, 2, 100);
		underTest.playWith(3);
		int result = underTest.getBoredom();
		assertEquals(55, result);
	}

	@Test
	public void happinessShouldNotGoAbove100() {
		Pet underTest = new Pet("", "", 1, 100, 1);
		underTest.playWith();
		int result = underTest.getHappiness();
		assertEquals(100, result);
	}

	@Test
	public void boredomShouldNotGoAbove100() {
		Pet underTest = new Pet("", "", 1, 1, 100);
		underTest.petTick();
		int result = underTest.getBoredom();
		assertEquals(100, result);
	}

	@Test
	public void boredomShouldNotGoBelow0() {
		Pet underTest = new Pet("", "");
		underTest.playWith();
		int result = underTest.getBoredom();
		assertEquals(0, result);

	}

}
