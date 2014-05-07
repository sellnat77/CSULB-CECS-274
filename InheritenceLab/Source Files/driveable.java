
public class driveable extends vehicle
{

	public void setSpecs()
	{
		System.out.println("How many seats does your car have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your car?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What is the fuel type?");
		this.setFuelType(userInputMod.next());
		System.out.println("What type of roof do you want? (Hard or Open)");
		this.setRoofType(userInputMod.next());
	}
	
	public void getSpecs()
	{
		System.out.println("Your car has " + this.getNumberOfSeats() + " seats");
		System.out.println("Car's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Car's fuel type is " + this.getFuelType());
		System.out.println("Car's roof type is "+this.getRoofType());
	}	
}
