// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3)  + args[0].charAt(4) + "");
		String M = "AM";
		
		if (hours == 0 ){
			hours = 12;
		}

		if (hours > 12 ) {
			M = "PM";
			if (hours > 12){
				hours = hours - 12;
			}
			
		}
		//the written HW assignment requirments do not fit the tests requirements
		//String hourS = (hours < 10) ? "0" + String.valueOf(hours) : String.valueOf(hours); 
		String minS = (minutes < 10) ? "0" + String.valueOf(minutes) : String.valueOf(minutes); 

		System.out.print(hours + ":" + minS + " " + M);

	}
}