
public class Dog extends Pet{
	//Instance fields
	private int dogSpaceNumber;
	private double dogWeight;
	private boolean grooming;
	
	//Constructor
	public Dog() {
	
	}
	
	//Mutator
	public void setDogSpaceNumber(int number) {
		dogSpaceNumber = number;
	}
	
	public void setDogWeight(double weight) {
		dogWeight = weight;
	}
	
	public void setGrooming(boolean g) {
		grooming = g;
	}
	
	//Accessor methods
	
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	
	public double getDogWeight() {
		return dogWeight;
	}
	
	public boolean getGrooming() {
		return grooming;
	}
}