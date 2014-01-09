package factorial;

public class FactCalcMethod2Stanford extends FactorialCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		println("Please enter the number");
		int a = in.nextInt();
		println("The factorial of the number is "+fact2(a));
	}
	private static int fact2(int n){
		int result = 1;
		if (n==0 || n==1){
			return 1;
		}else{
			for (int i=1; i<=n; i++){
			result *=i;
			}
			return result;
		}
	}
}
