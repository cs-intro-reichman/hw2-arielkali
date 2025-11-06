// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		// parse args from user
        int numterms = Integer.parseInt(args[0]);
        // create varible for pi
        double sum = 0.0;
        
        // calculate the sum using the formula.
        for (int i = 0; i < numterms; i++) {
            // calculate 
            int denominator = 2 * i + 1;
            
            // Add or subtract the term based on iteration (even/odd index)
            if (i % 2 == 0) {
                sum += 1.0 / denominator;
            } else {
                sum -= 1.0 / denominator;
            }
        }
        
		// multiply by 4
        double piapprox = 4 * sum;
        
        //print the outcome
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:	 " + piapprox);
	}
}
