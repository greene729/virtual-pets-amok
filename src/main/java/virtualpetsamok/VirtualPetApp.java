package virtualpetsamok;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		PetShelter shelter = new PetShelter();

		shelter.addNewPet(new Cat("Paul", "Grey, very prissy"));
		shelter.addNewPet(new Dog("Steven", "Black, kind of mangy"));
		shelter.addNewPet(new RobotPet("Bender", "Shiny, metal, has an ass"));

		System.out.println("Welcome to the Virtual Pet Shelter!");
		System.out.println("Thank you for volunteering!");
		System.out.println("Please remember to wear your slop boots \nand apron at all times.");

		boolean playerContinues = true;
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Pets currently in the shelter are:");

			shelter.displayPets();

			System.out.println("What would you like to do?");
			System.out.println("1 - Feed All Organic Pets");
			System.out.println("2 - Water All Organic Pets");
			System.out.println("3 - Perform Maintenance On Robotic Pets");
			System.out.println("4 - Walk the Dogs");
			System.out.println("5 - Play with a Pet");
			System.out.println("6 - Clean the Litter Box");
			System.out.println("7 - Clean one of the Cages");
			System.out.println("8 - Admit a new Pet");
			System.out.println("9 - Send Pet to their Forever Home (Adoption)");
			System.out.println("10 - Quit");

			String activity = input.nextLine();

			switch (activity.toLowerCase()) {

			case "1":
				System.out.println("Pick a food:");
				System.out.println("1 - Some sort of fruit?");
				System.out.println("2 - A salad or something. It's certainly leafy.");
				System.out.println("3 - Large quantity of unidentifiable meat");
				int foodType = input.nextInt();
				input.nextLine();
				shelter.feedAllOrganicPets(foodType);
				shelter.allTheTicks();
				break;
			case "2":
				System.out.println("Pick a drink:");
				System.out.println("1 - Good, old-fashioned, clearish water.");
				System.out.println("2 - A warm liquid that smells vaguely of ham");
				System.out.println("3 - Fancy schmancy electrolyte infused water.");
				int waterType = input.nextInt();
				input.nextLine();
				shelter.waterAllOrganicPets(waterType);
				shelter.allTheTicks();
				break;
			case "3":
				System.out.println("Pick a maintenance level:");
				System.out.println("1 - Just a once-over");
				System.out.println("2 - Full tune-up");
				System.out.println("3 - Major overhaul");
				int maintenanceType = input.nextInt();
				input.nextLine();
				shelter.maintenanceAllRobots(maintenanceType);
				shelter.allTheTicks();
				break;
			case "4":
				System.out.println("You walk the dogs. They did all their businesses.");
				System.out.println("For some reason the robots came too. They look less bored I guess.");
				System.out.println();
				shelter.walkAllWalkable();
				shelter.allTheTicks();
				break;
			case "5":
				System.out.println("Pick a pet to play with:");
				shelter.displayPets();
				String petToPlay = input.nextLine();
				System.out.println("Pick an activity:");
				System.out.println("1 - Play a board game while they try to eat the pieces.");
				System.out.println("2 - Throw something in a direction and see if they get it.");
				System.out.println("3 - Laser pointer. Hell yeah. You know you want to.");
				int playType = input.nextInt();
				input.nextLine();
				shelter.playWithPet(petToPlay, playType);
				shelter.allTheTicks();
				break;
			case "6":
				System.out.println("You clean the communal litterbox.");
				System.out.println("The cats look at you with gratitude.");
				System.out.println("Or disdain. It's really hard to tell.");
				shelter.cleanTheLitterBox();
				shelter.allTheTicks();
				break;
			case "7":
				System.out.println("Choose a which dog's cage to clean:");
				shelter.displayDogs();
				String dogToClean = input.nextLine();
				shelter.cleanACage(dogToClean);
				shelter.allTheTicks();
				break;
			case "8":
				System.out.println("What is the name of the pet you would like to deposit?");
				String newPetName = input.nextLine();
				System.out.println("Wonderful! " + newPetName + " is a lovely name!");
				System.out.println("Please tell us what " + newPetName + " looks like.");
				String newPetDescription = input.nextLine();
				System.out.println("Beautiful!");
				System.out.println("What kind of pet is " + newPetName + "?");
				System.out.println("1 - Cat");
				System.out.println("2 - Dog");
				System.out.println("3 - Robot");
				int petType = input.nextInt();
				input.nextLine();
				chooseNewPetType(shelter, newPetName, newPetDescription, petType);
				System.out.println("Welcome " + newPetName + "!");
				shelter.allTheTicks();
				break;
			case "9":
				System.out.println("Which lucky pet has found their forever home?");
				shelter.displayPets();
				String petToAdopt = input.nextLine();
				System.out.println("Good bye " + petToAdopt + "!");
				shelter.removePet(petToAdopt);
				break;
			case "10":
				playerContinues = false;
				break;
			default:
				System.out.println("I'm not sure what you're getting at. Maybe try that again?");

			}
		} while (playerContinues);

		System.out.println("Thank you again for volunteering at the Virtual Pet Center!");
		System.out.println("Hope to see you again soon!");
		System.exit(0);
		input.close();

	}

	private static void chooseNewPetType(PetShelter shelter, String newPetName, String newPetDescription, int petType) {
		if (petType == 1) {
			Pet newCat = new Cat(newPetName, newPetDescription);
			shelter.addNewPet(newCat);
		} else if (petType == 2) {
			Pet newDog = new Dog(newPetName, newPetDescription);
			shelter.addNewPet(newDog);
		} else if (petType == 3) {
			Pet newRobot = new RobotPet(newPetName, newPetDescription);
			shelter.addNewPet(newRobot);
		}

	}

}
