package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicPetsTest {

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

}