package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicPetTest {

	@Test
	public void shouldGetHunger() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

	@Test
	public void shouldGetThirst() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		int result = underTest.getThirst();
		assertEquals(1, result);
	}

	@Test
	public void tickShouldIncreaseHunger() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		underTest.organicPetTick();
		int result = underTest.getHunger();
		assertEquals(11, result);
	}

	@Test
	public void tickShouldIncreaseThirst() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		underTest.organicPetTick();
		int result = underTest.getThirst();
		assertEquals(11, result);
	}

	@Test
	public void highHungerShouldDecreaseHealth() {
		OrganicPet underTest = new OrganicPet("", "", 100, 1);
		underTest.organicPetTick();
		int result = underTest.getHealth();
		assertEquals(90, result);
	}

	@Test
	public void highThirstShouldDecreaseHealth() {
		OrganicPet underTest = new OrganicPet("", "", 1, 100);
		underTest.organicPetTick();
		int result = underTest.getHealth();
		assertEquals(90, result);
	}

	@Test
	public void damageShouldStillReturnToZeroAfterHungerDamage() {
		OrganicPet underTest = new OrganicPet("", "", 100, 1);
		underTest.organicPetTick();
		int result = underTest.getDamage();
		assertEquals(0, result);
	}

	@Test
	public void feedingShouldReduceHunger() {
		OrganicPet underTest = new OrganicPet("", "", 80, 1);
		underTest.feed();
		int result = underTest.getHunger();
		assertEquals(79, result);
	}

	@Test
	public void feedingOneShouldReduceHungerFifteen() {
		OrganicPet underTest = new OrganicPet("", "", 16, 1);
		underTest.feed(1);
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

	@Test
	public void feedingTwoShouldReduceHungerThirty() {
		OrganicPet underTest = new OrganicPet("", "", 31, 1);
		underTest.feed(2);
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

	@Test
	public void feedingThreeShouldReduceHungerFourtyFive() {
		OrganicPet underTest = new OrganicPet("", "", 46, 1);
		underTest.feed(3);
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

	@Test
	public void feedingOneShouldAlsoIncreaseThirstByFive() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		underTest.feed(1);
		int result = underTest.getThirst();
		assertEquals(6, result);
	}

	@Test
	public void feedingTwoShouldAlsoIncreaseThirstByTen() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		underTest.feed(2);
		int result = underTest.getThirst();
		assertEquals(11, result);
	}

	@Test
	public void feedingThreeShouldAlsoIncreaseThirstByFifteen() {
		OrganicPet underTest = new OrganicPet("", "", 1, 1);
		underTest.feed(3);
		int result = underTest.getThirst();
		assertEquals(16, result);
	}

	@Test
	public void wateringShouldReduceThirst() {
		OrganicPet underTest = new OrganicPet("", "", 1, 80);
		underTest.water();
		int result = underTest.getThirst();
		assertEquals(79, result);
	}

	@Test
	public void wateringOneShouldReduceThirstFifteen() {
		OrganicPet underTest = new OrganicPet("", "", 1, 16);
		underTest.water(1);
		int result = underTest.getThirst();
		assertEquals(1, result);
	}

	@Test
	public void wateringTwoShouldReduceThirstThirty() {
		OrganicPet underTest = new OrganicPet("", "", 1, 31);
		underTest.water(2);
		int result = underTest.getThirst();
		assertEquals(1, result);
	}

	@Test
	public void wateringThreeShouldReduceThirstFourtyFive() {
		OrganicPet underTest = new OrganicPet("", "", 1, 46);
		underTest.water(3);
		int result = underTest.getThirst();
		assertEquals(1, result);
	}
}