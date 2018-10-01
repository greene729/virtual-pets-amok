package virtualpetsamok;

public class OrganicPet extends Pet {

	private int hunger;
	private int thirst;

	public OrganicPet(String name, String description) {
		super(name, description);
		this.hunger = 0;
		this.thirst = 0;
	}

	// This overloaded constructor is for testing purposes
	public OrganicPet(String name, String description, int hunger, int thirst) {
		super(name, description);
		this.hunger = hunger;
		this.thirst = thirst;

	}

	public int getHunger() {
		return hunger;
	}

	public void hungerDamage() {
		if (hunger >= 100) {
			addDamage();
		}
	}

	public void thirstDamage() {
		if (thirst >= 100) {
			addDamage();
		}
	}

	public int getThirst() {
		return thirst;
	}

	public void organicPetTick() {
		hunger += 10;
		thirst += 10;
		collectOrganicDamage();
		generalTick();
	}

	public void collectOrganicDamage() {
		hungerDamage();
		thirstDamage();
	}

	public void feed() {
		hunger--;
	}

	public void feed(int feedType) {
		if (feedType == 1) {
			hunger -= 15;
			thirst += 5;
		}
		if (feedType == 2) {
			hunger -= 30;
			thirst += 10;
		}
		if (feedType == 3) {
			hunger -= 45;
			thirst += 15;
		}

	}

	public void water() {
		thirst--;
	}

	public void water(int waterType) {
		if (waterType == 1) {
			thirst -= 15;
		}
		if (waterType == 2) {
			thirst -= 30;
		}
		if (waterType == 3) {
			thirst -= 45;
		}
	}
}
