
public class flyable extends vehicle
{
	
	public void setSpecs()
	{
		System.out.println("How many seats does your plane have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your plane?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What is the fuel type?");
		this.setFuelType(userInputMod.nextLine());		
	}
	
	public void getSpecs()
	{
		System.out.println("Your plane has " + this.getNumberOfSeats() + " seats");
		System.out.println("Plane's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Plane's fuel type is " + this.getFuelType());
		System.out.println("Planes roof type is hard");
	}
	

}
