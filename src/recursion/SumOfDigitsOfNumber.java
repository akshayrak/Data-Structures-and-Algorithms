package recursion;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		System.out.println(sumOfDigitsOfNumber(999));
	}
	public static int sumOfDigitsOfNumber(int n) {
		if(n<0) {
			n= -n;
		}
		if(n==0) {
			return n;
		}
		return n%10+sumOfDigitsOfNumber(n/10);
	}
}
