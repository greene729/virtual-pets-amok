package virtualpetsamok;

public class RobotPet extends Pet implements Walkable {

	private int rust;
	private int oil;

	public RobotPet(String name, String description) {
		super(name, description);
		rust = 0;
		oil = 100;
	}

	public RobotPet(String name, String description, int rust, int oil) {
		super(name, description);
		this.rust = rust;
		this.oil = oil;
	}

	public int getRust() {
		return rust;
	}

	public int getOil() {
		return oil;
	}

	public void maintenance() {
		rust--;
		oil++;
	}

	public void maintenance(int maintenanceType) {
		if (maintenanceType == 1) {
			rust -= 15;
			oil += 15;
		}
		if (maintenanceType == 2) {
			rust -= 30;
			oil += 30;
		}
		if (maintenanceType == 3) {
			rust -= 45;
			oil -= 30;
		}
	}

	public void walk() {
		setBoredom(getBoredom() - 30);
	}

	public void robotTick() {
		oilDamage();
		rustDamage();
		rust += 10;
		oil -= 10;
	}

	private void rustDamage() {
		if (rust >= 100) {
			setHealth(getHealth() - 10);
		}

	}

	private void oilDamage() {
		if (oil <= 0) {
			setHealth(getHealth() - 10);
		}

	}

}
