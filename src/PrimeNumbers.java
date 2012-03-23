import java.util.ArrayList;


public class PrimeNumbers {
	public static ArrayList<Integer> PrimeFactors (int toFactor){
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		while(toFactor % 2 == 0){
			toReturn.add(2);
			toFactor /= 2;
		}
		for(int candidate = 3; toFactor > 1 ;candidate+=2){
			while(toFactor % candidate == 0){
				toReturn.add(candidate);
				toFactor /= candidate;
			}
		}
		return toReturn;
	}
	
	public static ArrayList<Integer> PrimeNumberGenerator (int n) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		OUT:
		for(int i = 2; i < n; i++){
			for (Integer p : toReturn)
	            if (i % p == 0)
	                continue OUT;
	        toReturn.add(i);		
		}
		return toReturn;
			
		
	}
}

