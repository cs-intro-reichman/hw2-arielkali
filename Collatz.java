// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		// Parse the inputs
        int maximum_seed = Integer.parseInt(args[0]);
        String mode = args[1];
		
		boolean verbose = mode.equals("v");

		for (int seed = 1; seed <= maximum_seed; seed++) {
            int current = seed;
            int steps = 0;

            if (verbose) {
                // Print starting seed
                System.out.print(current + " ");
            }
            
            // create hailstone sequence for this seed
            while (current != 1) {
                // calculate next value
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }
                
                if (verbose) {
                    System.out.print(current + " ");
                }
                steps++;
            }
            
            if (verbose) {
                System.out.println("(" + steps + ")");
            }
        }
        
        // Print summary line
        System.out.println("Every one of the first " + maximum_seed + " hailstone sequences reached 1.");
    }


}

