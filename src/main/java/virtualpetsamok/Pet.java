package virtualpetsamok;

public class Pet {

	private String name;
	private String description;
	private int happiness;
	private int health;
	private int boredom;
	private boolean alive;

	public Pet(String name, String description) {
		this.name = name;
		this.description = description;
		health = 100;
		happiness = 50;
		boredom = 0;
	}

	public Pet(String name, String description, int health, int happiness, int boredom) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.boredom = boredom;
		alive = true;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHappiness() {
		if (happiness <= 100) {
			return happiness;
		} else {
			happiness = 100;
			return happiness;
		}
	}

	public int getHealth() {
		return health;
	}

	public int getBoredom() {
		if (boredom >= 0 && boredom <= 100) {
			return boredom;
		} else if (boredom < 0) {
			boredom = 0;
			return boredom;
		} else
			boredom = 100;
		return boredom;

	}

	public boolean getAlive() {
		return alive;
	}

	public void checkIfDead() {
		if (health == 0) {
			alive = false;
		}
	}

	public void playWith() {
		happiness++;
		boredom--;
	}

	public void playWith(int playType) {
		if (playType == 1) {
			happiness += 15;
			boredom -= 15;
		} else if (playType == 2) {
			happiness += 30;
			boredom -= 30;
		} else if (playType == 3) {
			happiness += 45;
			boredom -= 45;
		} else {
			health -= health; // instantly kills pet if user selects non 1-3 option
		}

	}

	public void petTick() {
		boredom += 10;
	}

}