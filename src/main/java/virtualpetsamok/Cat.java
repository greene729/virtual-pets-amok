package virtualpetsamok;

public class Cat extends OrganicPet implements Poop {

	private static int waste;
	private int ticksSincePoop;

	public Cat(String name, String description) {
		super(name, description);
		this.waste = 0;
		this.ticksSincePoop = 0;
	}

// This overloaded constructor is for testing purposes
	public Cat(String name, String description, int ticksSincePoop, int waste) {
		super(name, description);
		this.ticksSincePoop = ticksSincePoop;
		this.waste = waste;
	}

	public int getWaste() {
		return waste;
	}

	public void poop() {
		waste++;
		ticksSincePoop = 0;
	}

	public void catTick() {
		checkPoopTimer();
		excessiveWasteDamage();

	}

	private void checkPoopTimer() {
		if (ticksSincePoop >= 4) {
			poop();
		} else {
			ticksSincePoop++;
		}
	}

	public int getTicksSincePoop() {
		return ticksSincePoop;
	}

	public void excessiveWasteDamage() {
		if (waste >= 10) {

			setHealth(getHealth() - 10);
		}
	}

	public void emptyLitterBox() {
		waste = 0;
	}

}
