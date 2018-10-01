package virtualpetsamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

	public void feedAllPets(int feedType) {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed(feedType);
			}
		}
	}

	public void waterAllPets(int waterType) {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water(waterType);
			}
		}
	}

	public void walkAllDogs() {
		for (Pet pet : petsInShelter()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}
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

}
