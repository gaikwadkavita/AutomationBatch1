package ifElseStatement;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//And &&
		//Or ||
		
		int month=2;
		int day=29;
		
		if (month==2 && day==29)
		{
			System.out.println("Leap year");
		}else
		{
			System.out.println("Not a leap year");
		}
		
		int tenth=60;
		int twelfth=59;
		int degree=60;
		
		if (tenth>=60 && twelfth>=60 && degree>=60)
		{
			System.out.println("Qualified");
			
		}else
		{
			System.out.println("Not qualified");
		}
		
		
		int hsc=60;
		int jee=100;
			
		if (hsc>=60 || jee>=100)
		{
			System.out.println("Qualified");
			
		}else
		{
			System.out.println("Not qualified");
		}
	}

}
