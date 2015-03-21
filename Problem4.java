/**
*Problem 4
*A palindromic number reads the same both ways. 
*The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
*Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Problem4
{
	public static void main(String[] args) {
		
		int original;
		int temp;
		int reverse;
		int remainder;
		int maxReverse = 0;
 
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				original = i * j;
				temp = original;
				reverse = 0;
				// this while reverse numbers
				while(temp != 0){
					remainder = temp % 10;
					reverse = reverse * 10 + remainder;
					temp = temp/10;
					if (original == reverse) 
						if (original > maxReverse) 
							maxReverse = original;			
				}
			}
		}
		System.out.println(" The largest palindrome made from the product of two 3-digit numbers is " + maxReverse);
	}
}