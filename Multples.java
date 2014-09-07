
public class Multples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for (int i=1; i<1000;i++) {
			System.out.println(i);

			if (i%3 == 0 || i%5 == 0) count = count + i;

		}
		System.out.println(count);
	}

}
