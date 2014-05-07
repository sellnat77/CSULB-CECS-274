
public class fourWheelers extends driveable
{
	public void setSpecs()
	{
		String fuel,roof;
		System.out.println("How many seats does your four wheeled car have?");
		this.setNumberOfSeats(userInput.nextInt());
		System.out.println("What is the fuel capacity of your four wheeled car?");
		this.setFuelCapacity(userInput.nextInt());
		System.out.println("What type of roof do you want? (Hard or Open)");
		roof = userInput.next();
		this.setRoofType(roof);		
		System.out.println("What is the fuel type?");
		fuel = userInput.next();
		this.setFuelType(fuel);
	}
	
	public void getSpecs()
	{
		System.out.println("Your four wheeled car has " + this.getNumberOfSeats() + " seats");
		System.out.println("Four wheeled car's fuel capacity is " + this.getFuelCapacity());
		System.out.println("Four wheeled car's fuel type is " + this.getFuelType());
		System.out.println("Four wheeled car's roof type is "+this.getRoofType());
	}	
}
