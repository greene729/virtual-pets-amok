package virtualpetsamok;

public class RobotPet extends Pet {

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

}
