
public class passanger extends flyable 
{
	public void setSpecs()
	{
		System.out.println("How many seats does your passenger plane have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your passenger plane?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What is the fuel type?");
		this.setFuelType(userInputMod.next());		
	}
	
	public void getSpecs()
	{
		System.out.println("Your passenger plane has " + this.getNumberOfSeats() + " seats");
		System.out.println("Passenger plane's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Passenger plane's fuel type is " + this.getFuelType());
		System.out.println("Passenger planes roof type is hard");
	}
	

}
