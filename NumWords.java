// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		int ones=0;
		int tens=0;

		if (n > 0){ 
			ones=n % 10;
			n = n/10; 
			if (n > 0) {
				tens=n % 10;
				n = n/10; 
			}
		
		}
		System.out.println(n+" hundreds, "+tens+" tens, and "+ones+" ones.");
	}//5 hundreds, 1 tens, and 7 ones.
	 
	}
