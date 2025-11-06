//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	         // save all arguments from command line
		String word = args[0];
		int reps = Integer.parseInt(args[1]);
		String an_chars = "AEFHILMNORSX";
		// parse to upper case
		word = word.toUpperCase();
		//cycle through words
		for (int index = 0; index < word.length(); index++) {
			//check if an or a
                        if (an_chars.indexOf(word.charAt(index)) != -1) {
				System.out.println("Give me an " + word.charAt(index) + ": " + word.charAt(index) + "!");
			} else {
				System.out.println("Give me a  " + word.charAt(index) + ": " + word.charAt(index) + "!");
			}	
		}
                //
		System.out.println("What does that spell?");
		for (int i = 0; i < reps; i++) {
			System.out.println(word + "!!!");
		}
        }
}
