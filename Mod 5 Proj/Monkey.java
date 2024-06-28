package Mod5Project;

public class Monkey extends RescueAnimal {

    // Instance variable
    private String breed;
    private String species;
    private String height;
    private String tailLength; 
    private String bodyLength;
    
    // Constructor
    public Monkey(String name, String species, String height, String tailLength, String bodyLength, 
    String gender, String age, String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setHeight(height);
        setTailLength(tailLength);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }
    public String getSpecies() {
    	return species;
    }
    public String getHeight() {
    	return height;
    }
    public String getTailLength() {
    	return tailLength;
    }
    public String getBodyLength() {
    	return bodyLength;
    }
    // Mutator Method
    public void setBreed(String monkeyBreed) {
        breed = monkeyBreed;
    }
    public void setSpecies(String monkeySpecies) {
    	species = monkeySpecies;
    }
    public void setHeight(String monkeyHeight) {
    	height = monkeyHeight;
    }
    public void setTailLength(String monkeyTailLength) {
    	tailLength = monkeyTailLength;
    }
    public void setBodyLength(String monkeyBodyLength) {
    	bodyLength = monkeyBodyLength;
    }
}
	
