package recursion;

public class printChar {
	public static void printChars(String str) {
		if (str.length()==0) {
			System.out.println();
			return;
		} else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	public static void printCharsReverse(String str) {
		if(str.length()==0) {
			System.out.println();
			return;
		} else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
