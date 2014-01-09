package hammingWeight;

public class CountByte {

	public static int countBits(byte num){
	  int count = 0;
	  while (num != 0)
	{
	    if (num % 2 == 1) // check if number have modulo
	{
	count++;
	}
	num /= 2; // divide the number by 2
	}
	  return count;    
	}
		public static int countBits2(byte num){
		  int count = 0;
		  for (int i = 0; i < 8; i++)
		{
		    if ((num & 1) == 1) // check if right most bit is 1
		{
		count++;
		}
		num = (byte)(num >>> 1); // shift right 1 bit, including the sign bit
		}
		  return count;    
		}
	
	public static void main(String[] args) {
		byte b = 125;
		System.out.println("The number of bits in "+ b+" are : "+countBits2(b));
	}

}
