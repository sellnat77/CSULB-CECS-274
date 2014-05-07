import java.util.Scanner;


public class vehicle 
{
	vehicle(){}
	public Scanner userInput = new Scanner(System.in);
	public Scanner userInputMod = new Scanner(System.in);
	private int numberOfSeats;
	private int fuelCapacity;
	private String fuelType;
	private String roofType;
	
	public void setNumberOfSeats(int A)
	{
		numberOfSeats = A;
	}
	public void setFuelCapacity(int A)
	{
		fuelCapacity = A;
	}
	public void setFuelType(String A)
	{
		fuelType = A;
	}
	public void setRoofType(String A)
	{
		roofType = A;
	}
	
	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}
	public int getFuelCapacity()
	{
		return fuelCapacity;
	}
	public String getFuelType()
	{
		return fuelType;
	}
	public String getRoofType()
	{
		return roofType;
	}
	
	public void selectVehicle()
	{
		int vehicleSelection;
		System.out.println("\n\nWhat kind of vehicle will you be purchasing?");
		System.out.println("\t1)Passenger Plane");
		System.out.println("\t2)Cargo Plane");
		System.out.println("\t3)Four Wheeled Car");
		System.out.println("\t4)Two Wheeled Car");
		System.out.println("\t5)Exit Program");
		vehicleSelection = userInput.nextInt();
		
		switch(vehicleSelection)
		{
		case 1:
			passanger pPlane = new passanger();
			pPlane.setSpecs();
			pPlane.getSpecs();
			this.selectVehicle();
			break;
		case 2:
			cargo cPlane = new cargo();
			cPlane.setSpecs();
			cPlane.getSpecs();
			this.selectVehicle();
			break;
		case 3:
			fourWheelers fCar = new fourWheelers();
			fCar.setSpecs();
			fCar.getSpecs();
			this.selectVehicle();
			break;
		case 4:
			twoWheelers tCar = new twoWheelers();
			tCar.setSpecs();
			tCar.getSpecs();
			this.selectVehicle();
			break;		
		default:
			break;			
		}
		
	}

}
