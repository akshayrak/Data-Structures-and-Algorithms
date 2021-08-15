package recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(power(-2,3));
	}
	
	public static int power(int b, int e) {
		if(e<0) {
			return -1;
		}
		if(e==0) {
			return 1; 
		}
		return b*power(b,e-1);
	}

}
