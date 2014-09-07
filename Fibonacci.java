public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 1;
		int second = 2;
		int run = 1;
		long sum = 2;
		while (run == 1) {
			int count = first + second;
			System.out.println(count);
			first = second;
			second = count;
			if (count > 4000000) run =0;
			else  			if (count %2 == 0) sum = sum + count;
			System.out.println("sum = " +sum);


		}
		System.out.println("sum = " +sum);

	}

}
