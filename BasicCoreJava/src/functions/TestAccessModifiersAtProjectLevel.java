package functions;

import accessModifiers.AccessModifiers;

      //Childclass or subclass or derivedclass        //parentClass or superclass
public class TestAccessModifiersAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModifiersAtProjectLevel obj1= new TestAccessModifiersAtProjectLevel();
		obj1.protectedFunction();
		obj1.sum();	

	}
	
	public static void sum()
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
	}

}
