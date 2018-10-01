package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PetShelter {

	private String newPetName;
	private String newPetDescription;

	Map<String, Pet> shelter = new HashMap<String, Pet>();

	public Collection<Pet> petsInShelter() {
		return shelter.values();
	}

	public void addNewPet(Pet pet) {
		this.newPetName = pet.getName();
		this.newPetDescription = pet.getDescription();
		shelter.put(newPetName, pet);

	}

	public void removePet(String petToRemove) {
		shelter.remove(petToRemove);

	}

	public void feedAllOrganicPets(int feedType) {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed(feedType);
			}
		}
	}

	public void waterAllOrganicPets(int waterType) {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water(waterType);
			}
		}
	}

	public void walkAllWalkable() {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).walk();
			}
		}
	}

	public void playWithPet(String petToPlay, int playType) {
		Pet pet = shelter.get(petToPlay);
		pet.playWith(playType);
	}

	public void maintenanceAllRobots(int maintenanceType) {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof RobotPet) {
				((RobotPet) pet).maintenance(maintenanceType);
			}
		}
	}

	public void cleanTheLitterBox() {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof Cat) {
				((Cat) pet).emptyLitterBox();
			}
		}
	}

	public void cleanACage(String cageToClean) {
		Dog dog = (Dog) shelter.get(cageToClean);
		dog.cleanCage();
	}

	public void allTheTicks() {
		for (Pet pet : petsInShelter()) {
			catTick(pet);
			dogTick(pet);
			robotTick(pet);
		}
	}

	private void robotTick(Pet pet) {
		if (pet instanceof RobotPet) {
			((RobotPet) pet).generalTick();
			((RobotPet) pet).robotTick();
		}
	}

	private void dogTick(Pet pet) {
		if (pet instanceof Dog) {
			((Dog) pet).generalTick();
			((Dog) pet).organicPetTick();
			((Dog) pet).dogTick();
		}
	}

	private void catTick(Pet pet) {
		if (pet instanceof Cat) {
			((Cat) pet).generalTick();
			((Cat) pet).organicPetTick();
			((Cat) pet).catTick();
		}
	}

	// the following 4 methods are in lieu of doing an @Override toString() for each
	// class
	public void displayPets() {
		for (Pet pet : petsInShelter()) {
			displayCat(pet);
			displayDog(pet);
			displayRobot(pet);
		}

	}

	private void displayCat(Pet pet) {
		if (pet instanceof Cat) {
			System.out.println("|" + pet.getName() + "|" + pet.getDescription() + "| Hunger: " + ((Cat) pet).getHunger()
					+ "| Thirst: " + ((Cat) pet).getThirst() + "| Boredom: " + pet.getBoredom() + "| Happiness: "
					+ pet.getHappiness() + "| Health: " + pet.getHealth() + "|");
		}
	}

	private void displayDog(Pet pet) {
		if (pet instanceof Dog) {
			System.out.println("|" + pet.getName() + "|" + pet.getDescription() + "| Hunger: " + ((Dog) pet).getHunger()
					+ "| Thirst: " + ((Dog) pet).getThirst() + "| Boredom: " + pet.getBoredom() + "| Happiness: "
					+ pet.getHappiness() + "| Waste: " + ((Dog) pet).getWaste() + "| Health: " + pet.getHealth() + "|");
		}
	}

	private void displayRobot(Pet pet) {
		if (pet instanceof RobotPet) {
			System.out.println("|" + pet.getName() + "|" + pet.getDescription() + "| Rust: "
					+ ((RobotPet) pet).getRust() + "| Oil Level: " + ((RobotPet) pet).getOil() + "| Boredom: "
					+ pet.getBoredom() + "| Happiness: " + pet.getHappiness() + "| Health: " + pet.getHealth() + "|");
		}
	}

// had to make a display of just dogs for the cleanACage() method in the App class
// don't need this for other types of pets so haven't made one	
	public void displayDogs() {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof Dog) {
				System.out.println("|" + pet.getName() + "|" + pet.getDescription() + "| Hunger: "
						+ ((Dog) pet).getHunger() + "| Thirst: " + ((Dog) pet).getThirst() + "| Boredom: "
						+ pet.getBoredom() + "| Happiness: " + pet.getHappiness() + "| Waste: " + ((Dog) pet).getWaste()
						+ "| Health: " + pet.getHealth() + "|");
			}
		}
	}
}
