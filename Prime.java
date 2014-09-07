
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 2;
			long n =600851475143L;
			    while (n > 1) {
		            //System.out.println("n=" +n);

			        while (n % d == 0) {
			          //  System.out.println("d=" +d);

			            System.out.println(d);
			            n = n /d;
			        }
			        d = d + 1;
			    }

	}
	

}
