package constructor;

public class Car {

	//Instance variables==>class level, non static //local variables
		String colour;
		String type;
		String fuelType;
		
		//class variables==>static variables	//global variables
		public static int wheels=4;
		
		
		public void features()
		{
			//int a=10;
			System.out.println(colour+" is the color of my car and type is "+type+" and it is "+fuelType+" car");
		}
		
		public Car()
		{
			
		}
	
		//constuctor to initialize instance variables
public Car(String colour, String type, String fuelType)
{
	//initialization //this will always point to your instance variables
	this.colour=colour;
	this.type=type;
	this.fuelType=fuelType;
}
}

