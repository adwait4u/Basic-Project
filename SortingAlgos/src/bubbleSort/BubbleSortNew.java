package bubbleSort;


public class BubbleSortNew {
	//bubbleSort
	public void bubbleSort(){
		for (int i = a.length-1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}
	
	//swap
	private void swap(int x, int y) {
		int tmp = a[x];
		a[x]= a[y];
		a[y] = tmp;
	}

	//printArray
	public void printArray(){
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	
	//main
	public static void main(String[] args) {
		System.out.println("\t==== Before sorting ====");
		System.out.print("\n\t\t");
		BubbleSortNew bbsObj = new BubbleSortNew();
		bbsObj.printArray();
		bbsObj.bubbleSort();
		System.out.println("\n\t==== After bubble sorting ====");
		System.out.print("\n\t\t");
		bbsObj.printArray();
	}
	
	//variable
	public int[] a = {10,4,5,6,2,1,8,3,7,9};
}
