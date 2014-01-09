package insertionSort;

public class InsertionSortNew {
	
	public static void insertionSort(){
	for (int i = 1; i < a.length; i++) {
			int toInsert = a[i];//System.out.println("toInsert is " +toInsert);
			int j = i;
		while(j > 0 && a[j-1] > toInsert) {
					a[j] = a[j-1];
					j--;					
				}
				a[j] = toInsert;
			// printArray();
			
			}
		}
	
	
	//printArray method
	public static void printArray(){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("    ==== Before Sorting ====\n");
		System.out.print("\t");
		printArray();
		insertionSort();
		System.out.println("\n==== After Insertion Sorting ====\n");
		System.out.print("\t");
		printArray();
	}
	//array
	//public static int[] a = {54,5,1,3,2};
	public static int[] a = {4, 5, 2, 6, 1, 3, 8, 7, 10, 9};
}
