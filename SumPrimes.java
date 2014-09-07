
public class SumPrimes {

	/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum =2;
		boolean run =true;
		int i= 2;
		while (run) {
			if (isPrime(i)) {
				
				if (i>2000000) {
					run = false;
					break;
				}
				sum = sum + i;
				System.out.println("sum="+sum + " Prime: " + i);
				
			}
			i++;
		}
		System.out.println("sum="+sum );

	}
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
