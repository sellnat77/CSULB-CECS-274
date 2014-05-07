
public class cargo extends flyable 
{
	public void setSpecs()
	{
		System.out.println("How many seats does your cargo plane have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your cargo plane?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What is the fuel type?");
		this.setFuelType(userInputMod.next());		
	}
	
	public void getSpecs()
	{
		System.out.println("Your cargo plane has " + this.getNumberOfSeats() + " seats");
		System.out.println("Cargo plane's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Cargo plane's fuel type is " + this.getFuelType());
		System.out.println("Cargo plane's roof type is hard");
	}
}
