
public class Palindrome {
	
	/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max =0;
		
		for (int i=1; i<999;i++) {
			for (int j=1; j<999;j++) {
				int prod = i*j;
				boolean ho = isPalin(prod);
				if (ho == true) {
					if (prod>max) {
						max = prod;
						System.out.println(prod);

					}
				}
			}
		}

	}
	
	static boolean isPalin(int number) {
		String temp = Integer.toString(number);
		int len = temp.length();
		if (temp.length() != 4 && temp.length() != 6) return false;

		int[] s = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    s[i] = temp.charAt(i) - '0';
		}
		
		
		if (temp.length() == 4) {
			if (s[0] == s[3] && s[1] == s[2]) return true;
		}
		if (temp.length() == 6) {
			if (s[0] == s[5] && s[1] == s[4] && s[2] == s[3]) return true;
		}
		return false;
	}

}
