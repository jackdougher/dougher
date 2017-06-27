package devops.numbers;

public class NumberWords {

	private static final String[] tensNames={
			"",
			"ten",
			"twenty",
			"thirty",
			"forty",
			"fifty",
			"sixty",
			"seventy",
			"eighty",
			"ninety"
	};

	private static final String[] numNames={
			"",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen"
	};

	public String convertLessThanOneThousand( String rawNumber ) {
		
		String current;

		
		// Convert the entered value to an int. If not an int it will throw an error
		int number = Integer.parseInt( rawNumber ) ;
		
		// If the value is 0 exit the program 
		if (number == 0) return "0";
		
		// If the value is less than 0 or greater than 999 report "Invalid number". 
		// Else, report the number
		if (number < 0)
			return "Negative number out of range" ;
		else if (number > 999)
			return "Number out of range" ;

		if(number%100 < 20) {
			current = numNames[number%100];
			number /= 100;
		}
		else {
			current = numNames[number%10];
			number /= 10;
			
			current = tensNames[number%10] + " " + current;
			number /= 10;
		}
		if(number == 0) return current;
		return numNames[number] + " hundred " + current;
	}
	
}
