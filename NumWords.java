// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		if (n > 0){ 
			System.out.print(n % 10 + " ones,");
			n = n/10; 
			if (n > 0) {
				System.out.print(n % 10 + " tens,");
				n = n/10; 
				if (n > 0) {
					System.out.print(n + " hundreds");
				}
			}
		}
	}
	 
	}
