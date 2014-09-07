
public class Pythagorean {

	/*
	 

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b ,c;
		int a2, b2;
		for (int i=1;i< 500;i++) {
			for (int j=1; j< 500; j++) {
				a2 = i *i ;
				a=i;
				b=j;
				b2 = j * j;
				double temp = Math.sqrt((double) (a2 + b2));
				long l = Math.round(temp);
				if (l * l == (a2 + b2)) {
					c = (int) l;
					if ((a + b + c) == 1000) {
						System.out.println("a =" + a + " b = " + b + " c=" + c);
break;
}
				}
				
			}
		}
	}

}
