/**
*Problem 3
*The prime factors of 13195 are 5, 7, 13 and 29.
*What is the largest prime factor of the number 600851475143 ?
*/
public class Problem3
{
	public static void main(String[] args) {
		
		int i; //iteration 
		long n = 600851475143L; // 
		int counter; // 

		for (i = 2; i <= n; i++) { 
			counter = 0; //my counter is zero because 
			while (n % i == 0) { 
				n = n/i; 
				/*increment the counter*/
				counter = counter + 1; 
			} 
			
			if(counter == 0) 
				continue; 
			System.out.println(i);
		}
	}
}