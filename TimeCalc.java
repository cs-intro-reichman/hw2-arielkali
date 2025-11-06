public class TimeCalc {
    public static void main(String[] args) {
        // The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // capture time to add
        int time_to_add = Integer.parseInt(args[1]);
        //calculate the time in minutes
        int total_min_calculation = (hours*60 + minutes + time_to_add) % (60*24);

        int new_hour = total_min_calculation / 60;
        int new_minutes = total_min_calculation % 60;

        	// prints data acording to minutes lower or higher then ten
		if (new_minutes < 10) {
            if (new_hour < 10) {
            System.out.println( "0" + new_hour + ":0" + new_minutes + " ");
            } else {
			System.out.println( new_hour + ":0" + new_minutes + " ");
            }
		} else {	
if (new_hour < 10) {
            System.out.println( "0" + new_hour + ":" + new_minutes + " ");
            } else {
			System.out.println( new_hour + ":" + new_minutes + " ");
            }		}

    }
}
