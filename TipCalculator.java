package HomeWork_StringTasks;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String split = "yes";
		
		boolean isSplit = split.equals("yes");
		
		int numberOfPeople = 4;
		double checkAmount = 476;
		String serviceRating = "excellent";
		double totalTip = 0;
		
		if (serviceRating.equals("excellent")) {
			totalTip = checkAmount * .25;
			
		}else if (serviceRating.equals("great")) {
			totalTip = checkAmount *.20;
			
		}else if (serviceRating.equals("good")) {
			totalTip = checkAmount *.15;
		
		}else if (serviceRating.equals("fair")) {
			totalTip = checkAmount *.10;
		
		}else if (serviceRating.equals("poor")) {
			totalTip = checkAmount *.5;
		
		}
		
		double perpersonAmount = 0;
		double perpersonTip = 0;
		double totalAmount = checkAmount + totalTip;
		
		System.out.println("number of people = " +numberOfPeople );
		
		if (isSplit) {
			perpersonAmount = totalAmount / numberOfPeople;
			perpersonTip = totalTip / numberOfPeople;
			
			System.out.println("Total To Pay = $"+totalAmount);
			System.out.println("Total Tip = $"+totalTip);
			System.out.println("Total Per Person = $"+totalAmount / numberOfPeople);
			System.out.println("Total Tip = $"+totalTip / numberOfPeople);
			
		}else {
			perpersonAmount = totalAmount;
			perpersonTip = totalTip;
			
			System.out.println("Total Cost for one person = $"+totalAmount);
			System.out.println("Total Tip for one person = $"+totalTip);
		}
			
		 
		
	}

}
