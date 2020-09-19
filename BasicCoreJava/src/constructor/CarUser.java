package constructor;

public class CarUser {

	public static void main(String[] args) {
	
		
		//Object is an instance of a class
		
		//Data Type //Object Reference  //Object(instance)
		Car         car1=                new Car();
//		int         a=                   10;
	//	boolean     status=              true;
		/*car1.colour="Red";
		car1.type="SUV";
		car1.fuelType="Diesel";
		//Car.wheels=4;
			car1.features();
			
			Car car2=new Car();			
			car2.colour="Blue";
			car2.type="Sedan";
			car2.fuelType="Petrol";
			car2.features();
			
			Car car3=new Car();
			car3.colour="White";
			car3.type="Hatchback";
			car3.fuelType="CNG";
			car3.features();*/
			
			Car car4=new Car("Black", "Auto", "Petrol");
			car4.features();
			
			Car car5=new Car();
			//car5.colour="Pink";
			car5.features();
			
			//Car car6=new Car("Orange","Tieto", "Diesel");
			//car6.features();
			
			

	}

}
