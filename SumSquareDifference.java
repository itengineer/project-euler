
public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum1 = 0;
		long sum2 = 0;

		for (int i =1; i< 101 ; i++) {
			sum1 = sum1 + i*i;
			sum2 = sum2 + i;
		}
		sum2 = sum2 * sum2;
		System.out.println(sum2 - sum1);
	}

}
