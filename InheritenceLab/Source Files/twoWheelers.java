
public class twoWheelers extends driveable
{
	public void setSpecs()
	{
		System.out.println("How many seats does your two wheeled car have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your two wheeled car?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What is the fuel type?");
		this.setFuelType(userInputMod.next());	
	}
	
	public void getSpecs()
	{
		System.out.println("Your two wheeled car has " + this.getNumberOfSeats() + " seats");
		System.out.println("Two wheeled car's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Two wheeled car's fuel type is " + this.getFuelType());
		System.out.println("Two wheeled car's roof type is open");
	}	
}
