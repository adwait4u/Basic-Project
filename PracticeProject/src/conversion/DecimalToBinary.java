package conversion;

public class DecimalToBinary {
	private static StringBuffer sBuf = new StringBuffer();
	public static void dec2Bin(int num){
		int cnt = 0;
		while(num != 0){
		int digit = num % 2;
		
		if (digit == 1)
			cnt++;
		sBuf.append(digit);
		num /= 2;
		}
		System.out.println("The binary for the given number is :"+sBuf.reverse());
		System.out.println(sBuf.length() +" and no of bits is "+cnt);
		
	}	
	
	
	public static void main(String[] args) {
		dec2Bin(125);
	}

}
