/**
 * Lab 10 Car class
 * @author Peyton Campbell
 *
 */
public class Car extends Vehicle {
	
	private int doors;
	private int passengers;
	
	
	public Car(String aMake, String aModel, String aPlate, int aDoors, int aPassengers) {
		
		super(aMake, aModel, aPlate);
		
		this.doors = aDoors;
		this.passengers = aPassengers;
	}
	
	
	public int getDoors() {
		return this.doors;
	}
	
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		
		String result = "";
		
		result = String.format("%d-door %s %s with license %s .", this.doors, this.getMake(), this.getModel(), this.getPlate());
		
		return result;
	}
	
	
	public boolean equals(Object brokenCar) {
		
		if(!(brokenCar instanceof Car)) {
			return false;
		}
		
		Car other = (Car) brokenCar;
		
		if(this.doors == other.doors) {
			if(this.passengers == other.passengers) {
				return super.equals(other);
			}
		}
		return false;
	}
	
	
	public Car copy() {
		
		String	makeCopy		= this.getMake();
		String	modelCopy		= this.getModel();
		String	plateCopy		= this.getPlate();
		int		doorsCopy		= this.doors;
		int		passengersCopy	= this.passengers;
		
		Car theCopy = new Car(makeCopy, modelCopy, plateCopy, doorsCopy, passengersCopy);
		return theCopy;
	}
}