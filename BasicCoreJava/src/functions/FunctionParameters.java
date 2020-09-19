package functions;

public class FunctionParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(10, 20, 30);
		
	}

//Access modifiers //Type/Nature //Return Type // Name //Parameters
public             static         void          sum     (int a, int b)
{
	System.out.println(a+b);
}
//Function overloading
public static void sum(int a, int b, int c)
{
	System.out.println(a+b+c);
}
public static void message(String name, int age)
{
	
}
	}
