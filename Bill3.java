// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sum = Integer.parseInt(args[3]) ;
		
		double finalSum = sum/3.0;

		finalSum= Math.ceil(finalSum);
		System.out.print(" Dear "+ name1+" " + name2 +" "+ name3 + ", pay " + finalSum + " Shekels each" );

	}
}

