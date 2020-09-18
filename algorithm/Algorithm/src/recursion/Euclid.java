package recursion;

public class Euclid {
	public static double gcd(int m, int n) {
		if (m<n) {
			int tmp=m; m=n; n=tmp;
		}
		if (m%n==0) {
			return n;
		} else {
			return gcd(n, m%n);
		}
		
	}
}
