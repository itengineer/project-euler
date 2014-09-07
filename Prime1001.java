
public class Prime1001 {
	
	/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		int i= 2;
		int counter =1;
		while (run) {
			if (isPrime(i)) {
				System.out.println("Counter="+counter + " Prime: " + i);
				counter++;
				if (counter == 10002) run = false;
			}
			i++;
		}
	}

//	public static boolean isPrime(int n) {
//	    return !new String(new char[n]).matches(".?|(..+?)\\1+");
//	}
	
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
