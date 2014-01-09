package codeEval;

public class findMax {

	
	public static void findMaximum(int[] a){
	
		int fBig = a[0];
		int sBig = a[1];
		if(sBig > fBig){
			int temp = fBig;
			fBig = sBig;
			sBig = temp;
		}
		
		for (int i = 2; i < a.length; i++) {
			if(a[i] > fBig && fBig != sBig){
				sBig = fBig;
				fBig = a[i];
			}else if(a[i] > sBig && a[i] != fBig){
				sBig = a[i];
			}
				
		}
		
		System.out.println("Max is "+fBig+" and second max is "+sBig);
	}
	
	public static int[] fillArray(){
		for (int i = 0; i < 10000000; i++) {
			a[i] = (int)(Math.random()*1000 +1000);
		}
		return a;
	}
	
	public static void printA(){
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] +" ");
		}

	}

	
	public static void main(String[] args) {
			long startTime  = System.currentTimeMillis();
			findMaximum(fillArray());
			long endTime  = System.currentTimeMillis();
			System.out.println("Total time spent is "+(endTime-startTime)+" ms");
			
			
			}//end of main
	private static int[] a = new int [10000000];
}//end of class