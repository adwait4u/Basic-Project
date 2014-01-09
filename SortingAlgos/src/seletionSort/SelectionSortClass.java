package seletionSort;

public class SelectionSortClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSortClass ssObj = new SelectionSortClass(10);
		ssObj.generateArray();
		ssObj.selectionSort();
	}

	//method selection sort
	public void selectionSort(){
		for (int i = 0; i < arraySize; i++) {
			int min = i;
			for (int j = i; j < arraySize; j++) {
				if(arrayOne[min]>arrayOne[j]){
					min = j;
				}//System.out.println("min is "+arrayOne[min]);
			}
			swap(i, min);
		}
		System.out.println();
		System.out.println();
		System.out.println("==========  The sorted Array by selection sort is  ==========");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(arrayOne[i]+" ");
			}
	}
	
	//method swap
	public void swap(int a, int b){
		int tmp = arrayOne[a];
		arrayOne[a] = arrayOne[b];
		arrayOne[b] = tmp;
	}
	//generating array
	public void generateArray(){
		for (int i = 0; i < arraySize; i++) {
			arrayOne[i] = (int)(Math.random()*100);
		System.out.print(arrayOne[i]+" ");
		}
	}
	
	//constructor
	SelectionSortClass(int size){
		arraySize = size;
		arrayOne = new int[size];
	}
	// defining the variables
	private int arraySize;
	private int[] arrayOne;
}
