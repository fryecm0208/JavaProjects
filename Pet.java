//Constructor
public class Pet {
//Instance fields
	String petType;
	String petName;
	int petAge;
	int dogSpaces = 30;
	int catSpaces = 12;
	int daysStay;
	double amountDue;

//Constructor
	public Pet (String pType, String pName, int pAge) {
		this.petType = pType;
		this.petName = pName;
		this.petAge = pAge;
	}
	
//Mutator
	public void setPetType(String type) {
		petType = type;
	}
	public void setPetName(String name) {
		petName = name;
	}
	public void setPetAge(int age) {
		petAge = age;
	}
	public void setDogSpaces (int dSpaces) {
		dogSpaces = dSpaces;
	}
	public void setCatSpaces (int cSpaces) {
		catSpaces = cSpaces;
	}
	public void setDaysStay (int stay) {
		daysStay = stay;
	}
	public void setAmountDue (double amtDue) {
		amountDue = amtDue;
	}
//Accessor methods
	public String getPetType() {
		return petType;
	}
	public String getPetName() {
		return petName; 
	}
	public int getPetAge() {
		return petAge;
	}
	public int getDogSpaces() {
		return dogSpaces;
	}
	public int getCatSpaces() {
		return catSpaces;
	}
	public int getDaysStay () {
		return daysStay;
	}
	public double getAmountDue() {
		return amountDue;
	}

}
