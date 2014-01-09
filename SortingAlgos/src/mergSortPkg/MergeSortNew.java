package mergSortPkg;

public class MergeSortNew {
	public void baseSort(){
		a = divideSort(a);
	}
	
	public int[] divideSort(int[] b){
		if(b.length <=1){// this is the base case
			return b;
			}
			int mid = b.length / 2;
			int[] left = new int[mid];
			int[] right = new int[b.length - mid];
			
			for (int i = 0; i < mid; i++) {
				left[i] = b[i];
			}
			int x = 0;
			for (int j = mid; j < b.length; j++) {
				if(x < right.length)
				{	right[x] = b[j];
					x++;}
				}
			left=divideSort(left);
			right=divideSort(right);
			b = mergeSort(left, right);
		return b;
		
	}
	
	public int[] mergeSort(int[] lt, int[] rt){
		resultArray = new int[lt.length+rt.length]; 
		int k = 0;
		 int L =0;
         int R =0;
         
         while (L < lt.length || R < rt.length)
         	{
                 if (L <lt.length && R < rt.length){
                	 	if (lt[L] <= rt[R])
                	 	{
	                         resultArray[k] = lt[L];
	                         L++;
	                         k++;
                	 	}else{
	                         resultArray[k] = rt[R];
	                         R++;
	                         k++;
                         	}
         			}else if (R < rt.length){
                     resultArray[k] = rt[R];
                     R++;
                     k++;
         			}else{
	            	 resultArray[k] = lt[L];
	            	 L++;
	            	 k++;
         			}
            }	
         return resultArray;
	}
	

	
	//print array
	public void printArray(){

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("\t==== Before sorting ====");
		System.out.print("\n\t\t");
		MergeSortNew msnObj = new MergeSortNew();
		msnObj.printArray();
		msnObj.baseSort();
		System.out.println("\n\t==== After merge sorting ====");
		System.out.print("\n\t\t");
		msnObj.printArray();
	}
	public int[] a = {9,4,5,6,2,1,3,8,7,121,11};
	public int[] resultArray;
}
