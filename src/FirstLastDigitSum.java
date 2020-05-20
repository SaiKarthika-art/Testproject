
public class FirstLastDigitSum {

	public static void main(String[] args) {
		int n = 120567;
		int lastDigit = n%10;
		System.out.println("Last Digit is : " +lastDigit);
		int firstDigit = n;
		while(firstDigit>=10) {
			firstDigit = firstDigit/10;
		}
		System.out.println("First Digit is : " +firstDigit);	
		int sum = lastDigit+firstDigit;
		System.out.println("Sum of first and last digit is : " +sum);
		
	}

}
