package accessModifiers;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		
	}

//Public, Private, Protected, No Access Mpd/Default

//public==>can be accessed throughout the project
//||Class - Y ||Package - Y||Project - Y

//private==>can be accessed only within the class
//|Class - Y||Package - N||Project - N

//default==>can be accessed within the package
//|Class - Y||Package - Y||Project - N

	//protected==>Can be accessed within the package 
		//and can be accessed outside the package by using child class object
		//||Class - Y||Package- Y|| Project - No*

public void publicFunction()
{
	System.out.println("Public Function");
}

private void privateFunction()
{
	System.out.println("Private Function");
}

void defaultFunction()
{
	System.out.println("No access modifiers function");
}
protected void protectedFunction()
{
	System.out.println("protected access modifiers");
}
}