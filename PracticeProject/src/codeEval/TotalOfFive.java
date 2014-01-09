package codeEval;

public class TotalOfFive {
	
	//add method
	public int addFive(){
		for (int i = 0; i < a.length; i++) {
			temp = 0;
			for (int j = i; j < i+4; j++) {
				
			temp += a[j];
			}System.out.println(temp);
		}
		
		return temp;
	}
	//main method
	public static void main(String[] args) {
		TotalOfFive tofObj = new TotalOfFive();

		tofObj.addFive();

	}

	private int[] a = {2,6,10,14,18,22,26,30,34,38};
	private int temp = 0;
}
