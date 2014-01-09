package codeEval;

public class SumOf1000Primes {
	
	public static void main(String[] args) {
		PrimeNumber pmObj = new PrimeNumber();
		int sum = 0;int count = 0;
		for (int j =2; count !=1000 ; j++) {
			if(pmObj.isPrime(j))
			{
				sum += j;
				count++;
			}
			
		}
		System.out.println("The sum of first 1000 prime numbers is "+sum);
		
	}
	
}
