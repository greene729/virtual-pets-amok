package virtualpetsamok;

public class Pet {

	private String name;
	private String description;
	private int happiness;
	private int health;
	private int boredom;
	private boolean alive;
	private int damage;

	public Pet(String name, String description) {
		this.name = name;
		this.description = description;
		health = 100;
		happiness = 50;
		boredom = 0;
		damage = 0;
	}

	// This overloaded constructor is for testing purposes
	public Pet(String name, String description, int health, int happiness, int boredom) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.boredom = boredom;
		damage = 0;
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

	public void collectDamage() {
		boredomDamage();
		happinessDamage();
	}

	public void boredomDamage() {
		if (boredom >= 100) {
			addDamage();
		}
	}

	public void addDamage() {
		damage += 10;
	}

	public void happinessDamage() {
		if (happiness == 0) {
			addDamage();
		}
	}

	public void applyDamage() {
		health -= damage;
		damage = 0;
	}

	public void generalTick() {
		boredom += 10;
		happiness -= 5;
		collectDamage();
		applyDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
