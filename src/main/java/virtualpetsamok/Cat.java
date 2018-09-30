package virtualpetsamok;

public class Cat extends OrganicPet implements Poop {

	private static int waste;
	private int ticksSincePoop;

	public Cat(String name, String description) {
		super(name, description);
		this.waste = 0;
		this.ticksSincePoop = 0;
	}

	public int getWaste() {
		return waste;
	}

	public void poop() {
		waste += 1;
	}

	public void catTick() {
		ticksSincePoop += 1;
		checkPoopTimer();
	}

	private void checkPoopTimer() {
		if (ticksSincePoop == 5) {
			poop();
		}
	}

	public int getTicksSincePoop() {
		return ticksSincePoop;
	}

}
