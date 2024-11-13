// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]) + 1;
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(rate,n);

		System.out.print ("After " + n + " years you will have $" + (int)futureValue + " Saved at %" + rate);
	}
}