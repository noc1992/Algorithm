package recursion;

public class printInBinary {
	public void printInBinary(int n) {
		if (n<2) {
			System.out.print(n);
			
		}else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
}	
