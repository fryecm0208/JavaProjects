	package Mod5Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
 

    
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
        char menuChoice;
 
        
        initializeDogList();
        initializeMonkeyList();   
        
     // Add a loop that displays the menu, accepts the users input
     // and takes the appropriate action.
        while (true) {
        	displayMenu();
        	
        	menuChoice = scnr.next().charAt(0);
        	scnr.nextLine();
        	if (menuChoice == '1') {
        		intakeNewDog(scnr);
        	}
        	else if (menuChoice == '2') {
        		intakeNewMonkey(scnr);
        	}
        	else if (menuChoice == '3') {
        		reserveAnimal(menuChoice);
        	}
        	else if (menuChoice == '4') {
        		printAnimals(menuChoice); 
        	}
        	else if (menuChoice == '5') {
        		printAnimals(menuChoice); 
        	}
        	else if (menuChoice == '6') {
        		printAnimals(menuChoice);
        	}
        	else if (menuChoice == 'q') {
        		System.out.println("Quitting application");
        		break;
        	}
        	else {
        		System.out.println("Invalid option. Please try again.");
        		menuChoice = '0';
        		continue;
        	}
        }
 
       }

        
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    

    // This method prints the menu options
    public static void displayMenu() {

        
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
     	}
    
    
    
    


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }
    public static ArrayList<Dog> getDogList() {
		return dogList;
	}

	public static void setDogList(ArrayList<Dog> dogList) {
		Driver.dogList = dogList;
	}
			

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey ("Chim Chim", "Capuchin", "91.44", "30.48", "61.04", "male", "1","25.6", "05-12-2019", "United States", "intake", false, "United States");
    	Monkey monkey2 = new Monkey ("Lemmywinks", "Macaque", "61.94", "20.22", "41.71", "female", "5","22.4", "02-08-2014", "Japan", "Phase I", false, "United States");
    	Monkey monkey3 = new Monkey ("Blinkin", "Squirrel monkey", "31.11", "12.34", "18.77", "male", "3","28.9", "11-28-2016", "India", "in service", true, "Canada");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    public static ArrayList<Monkey> getMonkeyList() {
		return monkeyList;
	}

	public static void setMonkeyList(ArrayList<Monkey> monkeyList) {
		Driver.monkeyList = monkeyList;
	}

	// Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
	// Add the code to instantiate a new dog and add it to the appropriate list
    public static void intakeNewDog(Scanner scanner) {
    	Scanner scnr = new Scanner(System.in);
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                displayMenu(); 
                return;//returns to menu
            } 
        }
      
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();


        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();


        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();


        System.out.println("What is the date the dog was acquired?");
        String acqDate = scanner.nextLine();


        System.out.println("Where was the dog acquired?");
        String acqLocation = scanner.nextLine();
   

        System.out.println("What is the current training status?");
        String trainStatus = scanner.nextLine();

        System.out.println("What country is the dog in service?");
        String svcCountry = scanner.nextLine();

        System.out.println("Is the dog reserved?");
        String reservStatus = scanner.nextLine();
      	boolean reservedStatus;
        if (reservStatus.equalsIgnoreCase("Yes")) {
          reservedStatus = true;
        }
        else {
          reservedStatus = false;
        }
      
      	Dog newDog = new Dog(name, breed, gender, age, weight, acqDate, acqLocation, trainStatus, reservedStatus, svcCountry);
      	dogList.add(newDog);
                
    }

        
    


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	Scanner scnr = new Scanner(System.in);
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		displayMenu(); 
            		return;
            	}
            	else {
            		
            		do {
            			monkey.setName(name);
            			
            		}while (!monkey.getName().equalsIgnoreCase(name));
            	}
            }
            scnr.nextLine();
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            
            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            	
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            	
            System.out.println("What is the date the monkey was acquired?");
            String acqDate = scanner.nextLine();
            
            System.out.println("Where was the monkey acquired?");
            String acqLocation = scanner.nextLine();
            
            System.out.println("What is the current training status?");
            String trainStatus = scanner.nextLine();

            System.out.println("What country is the monkey in service?");
            String svcCountry = scanner.nextLine();

            System.out.println("Is the monkey reserved?");
            String reservStatus = scanner.nextLine();
          	boolean reservedStatus;
            if (reservStatus.equalsIgnoreCase("Yes")) {
              reservedStatus = true;
            }
            else {
              reservedStatus = false;
            }
          
          	Monkey newMonkey= new Monkey(name, species, height, tailLength, bodyLength, 
          		    gender, age, weight, acqDate, acqLocation,
          			trainStatus, reservedStatus, svcCountry);
          	monkeyList.add(newMonkey);
                    
            	}

       
        
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(char listType) {
        	Scanner scnr = new Scanner(System.in);
            printAnimals('6');
        		System.out.println("Please provide animal type");
        		String animalType = scnr.nextLine();
        	
        		if (animalType.equalsIgnoreCase("Monkey")) {
        			for (Monkey monkey: monkeyList) {
        				System.out.println("What is the monkey's name you would like to reserve?");
        				String monkeyName = scnr.nextLine();
        				
        				if (monkey.getName().equalsIgnoreCase(monkeyName)) {
        					monkey.setReserved(true);
        					System.out.println(monkeyName + " is reserved!");
        				}
        				else {
        					continue;      					
        				}
        		}
        		if (animalType.equals("Dog")) {
        			for (Dog dog: dogList) {
        				System.out.println("What is the dog's name you would like to reserve?");
        				String dogName = scnr.nextLine();
        				
        				if (dog.getName().equalsIgnoreCase(dogName)) {
        					dog.setReserved(true);
        					System.out.println(dogName + " is reserved!");
        				}
        				else {
        					continue;  
        			}
        		}
        	}
        }
        	}
        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys

        
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char listType) {            
            if (listType == '4') {
            	System.out.println("Dog List");
            	
            	for (Dog dog : dogList) {
            		System.out.println("Name: " + dog.getName());
            		System.out.println("Breed: " + dog.getBreed());
            		System.out.println("Gender: " + dog.getGender());
            		System.out.println("Age: " + dog.getAge() + " years old.");
            		System.out.println("Weight: " + dog.getWeight() + " lbs.");
            		System.out.println("Acquisition Date: " + dog.getAcquisitionDate());
            		System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
            		System.out.println("Training Status: " + dog.getTrainingStatus());
            		System.out.println("Reserved?: " + dog.getReserved()); 
            		System.out.println("Service Location: " + dog.getInServiceLocation());
            		System.out.println("------------------");
            	}
            }
            if (listType == '5') {
            	System.out.println("Monkey List: ");
            	
            	for (Monkey monkey : monkeyList) {
            		System.out.println("Name: " + monkey.getName());
            		System.out.println("Species: " + monkey.getSpecies());
            		System.out.println("Height: " + monkey.getHeight() + " cm");
            		System.out.println("Tail Length: " + monkey.getTailLength() + " cm");
            		System.out.println("Body Length: " + monkey.getBodyLength() + " cm");
            		System.out.println("Gender: " + monkey.getGender());
            		System.out.println("Age: " + monkey.getAge() + " years old.");
            		System.out.println("Weight: " + monkey.getWeight() + " lbs.");
            		System.out.println("Acquisition Date: " + monkey.getAcquisitionDate());
            		System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
            		System.out.println("Training Status: " + monkey.getTrainingStatus());
            		System.out.println("Reserved?: " + monkey.getReserved()); 
            		System.out.println("Service Location: " + monkey.getInServiceLocation());
            		System.out.println("------------------");
                	}
            	}
            if (listType == '6') {
            	System.out.println("Animals that are not reserved");
            	
            	for (Dog dog : dogList) {
            		if (dog.getReserved() == false) {
                		System.out.println("Name: " + dog.getName());
                		System.out.println("Animal Type: Dog");
                		System.out.println("Breed: " + dog.getBreed());
                		System.out.println("Gender: " + dog.getGender());
                		System.out.println("Age: " + dog.getAge() + " years old.");
                		System.out.println("Weight: " + dog.getWeight() + " lbs.");
                		System.out.println("Acquisition Date: " + dog.getAcquisitionDate());
                		System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
                		System.out.println("Training Status: " + dog.getTrainingStatus());
                		System.out.println("Reserved?: " + dog.getReserved()); 
                		System.out.println("Service Location: " + dog.getInServiceLocation());
                		System.out.println("------------------");
            		}
            		else {
            			continue;
            		}
            	for (Monkey monkey : monkeyList) {
            		if (monkey.getReserved() == false) {
                		System.out.println("Name: " + monkey.getName());
                		System.out.println("Animal Type: Monkey");
                		System.out.println("Breed: " + monkey.getBreed());
                		System.out.println("Gender: " + monkey.getGender());
                		System.out.println("Age: " + monkey.getAge() + " years old.");
                		System.out.println("Weight: " + monkey.getWeight() + " lbs.");
                		System.out.println("Acquisition Date: " + monkey.getAcquisitionDate());
                		System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
                		System.out.println("Training Status: " + monkey.getTrainingStatus());
                		System.out.println("Reserved?: " + monkey.getReserved()); 
                		System.out.println("Service Location: " + monkey.getInServiceLocation());
                		System.out.println("------------------");
            			
            		}
            	}
            	
            	}

            }
        }
		}


