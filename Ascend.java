// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]) ;
		int min = 0;

		int a = (int)(Math.random() * ((lim - min) + 1)) + min;
		int b = (int)(Math.random() * ((lim - min) + 1)) + min;
		int c = (int)(Math.random() * ((lim - min) + 1)) + min;

		System.out.println(a + " " + b + " " + c);

		int minimum = Math.min(a, b);
		minimum = Math.min(minimum, c);

		int maximum = Math.max(a, b);
		maximum = Math.max(maximum, c);

		int mid = a + b + c - minimum - maximum;
		System.out.println(minimum + " " + mid + " " + maximum);

	}
}
