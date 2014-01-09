package seletionSort;

public class SelectionSortNew {
	
	public void selectionSort(){
		for (int i = 0; i < a.length; i++) {
			int oldMinimum = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[oldMinimum]){
					 oldMinimum = j;
				}
			}
			swap(oldMinimum, i);
		//	printArray();
		}
	}
	public void swap(int x, int y){
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}
			
	public void printArray(){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
			

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== before sorting ====");
		SelectionSortNew ssnObj = new SelectionSortNew();
		ssnObj.printArray();
		ssnObj.selectionSort();
		System.out.println();
		System.out.println("==== after sorting ====");
		ssnObj.printArray();
		System.out.println("Maximum is "+a[a.length - 1]);
		System.out.println("Second Maximum is "+a[a.length - 2]);
		
	}


	private static int[] a = {4, 5, 2, 6, 1, 3, 8, 7, 10, 9};
}

