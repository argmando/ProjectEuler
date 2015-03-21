public class ReverseNumber
{
	public static void main(String[] args) {
		
		int original = 110;
		int reverse = 0;
		int remainder;

		while(original != 0)
		{
			System.out.print(original + " % 10 = ");
			remainder = original % 10;
			System.out.println(remainder);

			System.out.print(reverse + " * 10 " + "+ " + remainder + "= ");
			reverse = reverse * 10 + remainder;
			System.out.println(reverse);

			System.out.print(original + " / 10 = ");
			original = original/10;
			System.out.println(original + "\n");
		}

		System.out.println(reverse);
	}
}