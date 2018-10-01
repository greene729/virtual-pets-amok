package virtualpetsamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTest {

	@Test
	public void shouldGetRust() {
		RobotPet underTest = new RobotPet("", "", 10, 10);
		int result = underTest.getRust();
		assertEquals(10, result);
	}

	@Test
	public void shouldGetOil() {
		RobotPet underTest = new RobotPet("", "", 10, 10);
		int result = underTest.getOil();
		assertEquals(10, result);
	}

	@Test
	public void maintenanceShouldRemoveRust() {
		RobotPet underTest = new RobotPet("", "", 10, 10);
		underTest.maintenance();
		int result = underTest.getRust();
		assertEquals(9, result);
	}

	@Test
	public void maintenanceShouldAddOil() {
		RobotPet underTest = new RobotPet("", "", 10, 10);
		underTest.maintenance();
		int result = underTest.getOil();
		assertEquals(11, result);
	}

	// additional tests involving maintenance have been assumed to work based on
	// similar tests with different variables from other classes

}
